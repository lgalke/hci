package hci.swipingburger;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.SecureRandom;
import java.math.BigInteger;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String HAMBURGER = "burger";
    public static final String SWIPE = "swipe";

    public static final float ID_TEXT_SIZE = 20f;

    public final class SessionIdentifierGenerator {
        private SecureRandom random = new SecureRandom();

        public String nextSessionId() {
            return new BigInteger(32, random).toString(32).toUpperCase();
        }
    }

    private SessionIdentifierGenerator generator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generator = new SessionIdentifierGenerator();

        final TextView idTextView = (TextView) findViewById(R.id.idTextView);
        Button newParticipant = (Button) findViewById(R.id.newParticipant);
        final Button goButton = (Button) findViewById(R.id.goButton);
        newParticipant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String participantId = generator.nextSessionId();
                idTextView.setText(participantId);
                idTextView.setTypeface(null, Typeface.BOLD);
                idTextView.setTextSize(ID_TEXT_SIZE);
                goButton.setEnabled(true);
            }
        });

        // go button should be disabled at the start, so it cannot be clicked without a participant id generated
        goButton.setEnabled(false);

        // start the experiment on click
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TreasureHuntFragmentActivity.class);
                intent.putExtra("participantId", idTextView.getText());
                intent.putExtra("navigation", determineNavigationMethod());
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0) {
            Button goButton = (Button) findViewById(R.id.goButton);
            goButton.setEnabled(false);
            Log.i("","");

            final TextView idTextView = (TextView) findViewById(R.id.idTextView);
            idTextView.setText("");
        }
    }

    private String determineNavigationMethod() {
        Random random = new Random();
        if (random.nextFloat() > 0.5) {
            return HAMBURGER;
        } else {
            return SWIPE;
        }
    }
}

