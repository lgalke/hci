
# Analysis

## Preprocessing

* experiment_results.csv
* task_questionnaire_results.csv
* final_questionnaire_results.csv
* demographic_data_fixed.csv

Dropping Task ID 0 (Training)

Asserting Absolute Distance Values!

| Dataset Validation:
| dict_items([('pid', True)])

| Adding success column based on
| `opt_interactions == interactions`
| in order to measure effectiveness.

| Split by Navigation, Pid, Tid, apply `mean` combine!

Drop jid and pid columns

| Computing efficiency task $1000 *                       mean_success/mean_time_ms$

Using normality test: shapiro

## Demographics

### age

|  |age |
| -|--- |
| count|50.0 |
| mean|24.1 |
| std|2.90144228737 |
| min|20.0 |
| 25%|22.0 |
| 50%|24.0 |
| 75%|25.0 |
| max|35.0 |

### sex

| ('f', 29)
| ('m', 21)

### job

| ('Agrarwissenschaften', 5)
| ('Agribusiness', 1)
| ('Betriebswirtschaftslehre', 1)
| ('Biochemie', 1)
| ('Biologie', 1)
| ('Ernährungs- und Verbraucherökonomie', 2)
| ('Finanzmathematik', 2)
| ('Informatik / Nachhilfelehrer', 1)
| ('Mathemathik / Chemie', 1)
| ('Mathemathik / Deutsch / Psychologie', 1)
| ('Mathemathik / Geologie', 1)
| ('Mathemathik / Geschichte', 1)
| ('Mathemathik / Philosophie', 1)
| ('Mathemathik / Physik', 1)
| ('Mathemathik / Sport', 1)
| ('Mathematik', 4)
| ('Mathematik / Informatik', 1)
| ('Mathematik / Spanisch', 1)
| ('Medizin', 1)
| ('Musikwissenschaft / Philosophie', 1)
| ('Physik', 1)
| ('Politikwissenschaft / Ur- und Frühgeschichte', 1)
| ('Psychologie', 4)
| ('Rechtswissenschaften', 1)
| ('Soziologie / Pädagogik', 1)
| ('Volkswirtschaftslehre', 3)
| ('Wirtschaftsinformatik', 6)
| ('Wirtschaftsingenieur', 2)
| ('Wirtschaftswissenschaften Profil: Handelslehrer', 1)

### smartphone

| ('None', 1)
| ('android', 37)
| ('nodroid', 12)

### comments

| ('Ich zweifle die Aussagekraft der Studie an, da die Navigation nur aus „Wischen nach links“ und „Wischen nach rechts“ besteht.', 1)
| ('Menü-Steuerung: nur 5/7 Steine da: Menü zum Ausklappen. besser: dauerhaft ausgeklappt - >1 Klick statt 2', 1)
| ('Samsung', 1)
| ('man könnte die Bedienung noch vereinfachen, indem man durch wischen von Tür zu Tür kann', 1)
| ('schön kurz :)', 1)

## Efficiency by Tasks

### Descriptions (efficiency)

#### Global Descriptions (efficiency)

##### burger

|  |efficiency |
| -|---------- |
| count|110.0 |
| mean|0.223055228972 |
| std|0.0500230406763 |
| min|0.068976220448 |
| 25%|0.190058286882 |
| 50%|0.22691177807 |
| 75%|0.25700334919 |
| max|0.336157052575 |

| shapiro
| (0.982802152633667, 0.16857866942882538)

##### swipe

|  |efficiency |
| -|---------- |
| count|140.0 |
| mean|0.215488934466 |
| std|0.100837665235 |
| min|0.0783468808148 |
| 25%|0.140770307033 |
| 50%|0.186047319425 |
| 75%|0.267820085532 |
| max|0.514986095375 |

| shapiro
| (0.8906473517417908, 9.997179084564323e-09)

#### Repeated measures (efficiency)

##### burger

| KruskalResult(statistic=21.228960676540432, pvalue=0.00028522628404656868)
| FriedmanchisquareResult(statistic=30.509090909090901, pvalue=3.8548715779974447e-06)

##### swipe

| KruskalResult(statistic=91.910160660008614, pvalue=5.1718364795390112e-19)
| FriedmanchisquareResult(statistic=80.628571428571377, pvalue=1.2818240657137304e-16)

#### Descriptions per tid (efficiency)

##### ('burger', 1)

|  |efficiency |
| -|---------- |
| count|22.0 |
| mean|0.259627939777 |
| std|0.03615089292 |
| min|0.189458527528 |
| 25%|0.242800150862 |
| 50%|0.263092621632 |
| 75%|0.281021933116 |
| max|0.336157052575 |

| shapiro
| (0.9797267913818359, 0.9116690158843994)

##### ('burger', 2)

|  |efficiency |
| -|---------- |
| count|22.0 |
| mean|0.218885902709 |
| std|0.0617582924756 |
| min|0.068976220448 |
| 25%|0.175369392634 |
| 50%|0.229429832866 |
| 75%|0.262567057042 |
| max|0.298650101541 |

| shapiro
| (0.9300146698951721, 0.12278316169977188)

##### ('burger', 3)

|  |efficiency |
| -|---------- |
| count|22.0 |
| mean|0.207954767299 |
| std|0.0501700789335 |
| min|0.0904895484572 |
| 25%|0.177580422745 |
| 50%|0.214082948414 |
| 75%|0.246063771629 |
| max|0.280033604032 |

| shapiro
| (0.9594280123710632, 0.47780340909957886)

##### ('burger', 4)

|  |efficiency |
| -|---------- |
| count|22.0 |
| mean|0.228578290867 |
| std|0.0445345887587 |
| min|0.113259903163 |
| 25%|0.21190614273 |
| 50%|0.227615297646 |
| 75%|0.251743012241 |
| max|0.304284323272 |

| shapiro
| (0.9578091502189636, 0.4463047385215759)

##### ('burger', 5)

|  |efficiency |
| -|---------- |
| count|22.0 |
| mean|0.200229244208 |
| std|0.0336254251422 |
| min|0.144350135689 |
| 25%|0.177255912416 |
| 50%|0.196225661233 |
| 75%|0.22656990971 |
| max|0.255076012652 |

| shapiro
| (0.9565542340278625, 0.4229176640510559)

##### ('swipe', 1)

|  |efficiency |
| -|---------- |
| count|28.0 |
| mean|0.376411637958 |
| std|0.0826782359999 |
| min|0.124738828079 |
| 25%|0.339208375025 |
| 50%|0.385810331212 |
| 75%|0.43554876804 |
| max|0.514986095375 |

| shapiro
| (0.9320521354675293, 0.06946220248937607)

##### ('swipe', 2)

|  |efficiency |
| -|---------- |
| count|28.0 |
| mean|0.235764444338 |
| std|0.0515833509387 |
| min|0.0783468808148 |
| 25%|0.214528622096 |
| 50%|0.250787488437 |
| 75%|0.270937446389 |
| max|0.305866519851 |

| shapiro
| (0.8996769189834595, 0.011243253946304321)

##### ('swipe', 3)

|  |efficiency |
| -|---------- |
| count|28.0 |
| mean|0.176438327988 |
| std|0.0368031666814 |
| min|0.106547333653 |
| 25%|0.149048762852 |
| 50%|0.183800941036 |
| 75%|0.207357536463 |
| max|0.233165454206 |

| shapiro
| (0.9592775106430054, 0.335141658782959)

##### ('swipe', 4)

|  |efficiency |
| -|---------- |
| count|28.0 |
| mean|0.158462999373 |
| std|0.0321520787395 |
| min|0.0888474267564 |
| 25%|0.137780626155 |
| 50%|0.155438077528 |
| 75%|0.183456377089 |
| max|0.223483663344 |

| shapiro
| (0.9860244989395142, 0.9621443152427673)

##### ('swipe', 5)

|  |efficiency |
| -|---------- |
| count|28.0 |
| mean|0.130367262672 |
| std|0.0267090785385 |
| min|0.0821186614658 |
| 25%|0.120638250545 |
| 50%|0.128225214081 |
| 75%|0.143514673291 |
| max|0.182588372772 |

| shapiro
| (0.9574891924858093, 0.30354103446006775)

### Cross-compare Tests per tid (efficiency)

#### ('burger', 1) vs ('burger', 2)

{'N': 44, 'effect_size': 0.66946021956115787, 'df': 21, 'test_result': Ttest_relResult(statistic=3.1400467644045085, pvalue=0.0049443978028402098), 'n1': 22, 'n2': 22}

#### ('burger', 1) vs ('burger', 3)

{'N': 44, 'effect_size': 0.8493099572214986, 'df': 21, 'test_result': Ttest_relResult(statistic=3.9836168083266799, pvalue=0.00067564806607191632), 'n1': 22, 'n2': 22}

#### ('burger', 1) vs ('burger', 4)

{'N': 44, 'effect_size': 0.60049107141057878, 'df': 21, 'test_result': Ttest_relResult(statistic=2.8165527849774352, pvalue=0.010338413955597564), 'n1': 22, 'n2': 22}

#### ('burger', 1) vs ('burger', 5)

{'N': 44, 'effect_size': 1.8817447075438416, 'df': 21, 'test_result': Ttest_relResult(statistic=8.8261650322279657, pvalue=1.6451903254595333e-08), 'n1': 22, 'n2': 22}

#### ('burger', 1) vs ('swipe', 1)

{'N': 50, 'effect_size': -1.9097298327149146, 'df': 38.785742202473031, 'test_result': Ttest_indResult(statistic=-6.7031245086454758, pvalue=5.6381782972874956e-08), 'n1': 22, 'n2': 28}

#### ('burger', 1) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.24350649350649356, 'test_result': MannwhitneyuResult(statistic=233.0, pvalue=0.072691640416537293), 'n2': 28}

#### ('burger', 1) vs ('swipe', 3)

{'N': 50, 'effect_size': 2.2829620500029861, 'df': 45.605549072886376, 'test_result': Ttest_indResult(statistic=8.0131642746175658, pvalue=3.0036765567743509e-10), 'n1': 22, 'n2': 28}

#### ('burger', 1) vs ('swipe', 4)

{'N': 50, 'effect_size': 2.9366881218094303, 'df': 42.458884481600464, 'test_result': Ttest_indResult(statistic=10.307733474302083, pvalue=3.9626211595999131e-13), 'n1': 22, 'n2': 28}

#### ('burger', 1) vs ('swipe', 5)

{'N': 50, 'effect_size': 3.9971846751859452, 'df': 37.509707823002977, 'test_result': Ttest_indResult(statistic=14.030061269834485, pvalue=1.6751765716561837e-16), 'n1': 22, 'n2': 28}

#### ('burger', 2) vs ('burger', 3)

{'N': 44, 'effect_size': 0.25059968919993747, 'df': 21, 'test_result': Ttest_relResult(statistic=1.17541673163024, pvalue=0.25298310480066288), 'n1': 22, 'n2': 22}

#### ('burger', 2) vs ('burger', 4)

{'N': 44, 'effect_size': -0.19503194345704855, 'df': 21, 'test_result': Ttest_relResult(statistic=-0.91478090125993261, pvalue=0.37069158497461707), 'n1': 22, 'n2': 22}

#### ('burger', 2) vs ('burger', 5)

{'N': 44, 'effect_size': 0.36443693494719148, 'df': 21, 'test_result': Ttest_relResult(statistic=1.7093607431380531, pvalue=0.10212210775377208), 'n1': 22, 'n2': 22}

#### ('burger', 2) vs ('swipe', 1)

{'N': 50, 'effect_size': -2.1964344153980879, 'df': 47.903652892032788, 'test_result': Ttest_indResult(statistic=-7.7094535097442627, pvalue=6.1460659425243401e-10), 'n1': 22, 'n2': 28}

#### ('burger', 2) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.14610389610389607, 'test_result': MannwhitneyuResult(statistic=263.0, pvalue=0.19222905550361363), 'n2': 28}

#### ('burger', 2) vs ('swipe', 3)

{'N': 50, 'effect_size': 0.8121269529860301, 'df': 32.392545034300269, 'test_result': Ttest_indResult(statistic=2.8505540361974759, pvalue=0.0075330728311379285), 'n1': 22, 'n2': 28}

#### ('burger', 2) vs ('swipe', 4)

{'N': 50, 'effect_size': 1.1871061872924931, 'df': 29.84388793928602, 'test_result': Ttest_indResult(statistic=4.1667258070177873, pvalue=0.00024295893165475588), 'n1': 22, 'n2': 28}

#### ('burger', 2) vs ('swipe', 5)

{'N': 50, 'effect_size': 1.7884292636279995, 'df': 27.169372064223619, 'test_result': Ttest_indResult(statistic=6.2773612390822446, pvalue=9.9419198495425322e-07), 'n1': 22, 'n2': 28}

#### ('burger', 3) vs ('burger', 4)

{'N': 44, 'effect_size': -0.5214909858414325, 'df': 21, 'test_result': Ttest_relResult(statistic=-2.4460095385965119, pvalue=0.023338332791632995), 'n1': 22, 'n2': 22}

#### ('burger', 3) vs ('burger', 5)

{'N': 44, 'effect_size': 0.16727413301634728, 'df': 21, 'test_result': Ttest_relResult(statistic=0.78458522971067601, pvalue=0.4414581754358432), 'n1': 22, 'n2': 22}

#### ('burger', 3) vs ('swipe', 1)

{'N': 50, 'effect_size': -2.5346208780888522, 'df': 45.413055852663888, 'test_result': Ttest_indResult(statistic=-8.8964831763080898, pvalue=1.638058471616648e-11), 'n1': 22, 'n2': 28}

#### ('burger', 3) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.36038961038961037, 'test_result': MannwhitneyuResult(statistic=197.0, pvalue=0.015401027053631673), 'n2': 28}

#### ('burger', 3) vs ('swipe', 3)

{'N': 50, 'effect_size': 0.70376045931483877, 'df': 37.322733521049877, 'test_result': Ttest_indResult(statistic=2.470189187096973, pvalue=0.018195085242505033), 'n1': 22, 'n2': 28}

#### ('burger', 3) vs ('swipe', 4)

{'N': 50, 'effect_size': 1.1462100107866362, 'df': 33.987304407263395, 'test_result': Ttest_indResult(statistic=4.0231808100500288, pvalue=0.00030313523132898115), 'n1': 22, 'n2': 28}

#### ('burger', 3) vs ('swipe', 5)

{'N': 50, 'effect_size': 1.8689406873961953, 'df': 30.228298418120758, 'test_result': Ttest_indResult(statistic=6.5599551896199069, pvalue=2.8434885910251012e-07), 'n1': 22, 'n2': 28}

#### ('burger', 4) vs ('burger', 5)

{'N': 44, 'effect_size': 0.59609260976552092, 'df': 21, 'test_result': Ttest_relResult(statistic=2.7959221711584767, pvalue=0.010828183767257568), 'n1': 22, 'n2': 22}

#### ('burger', 4) vs ('swipe', 1)

{'N': 50, 'effect_size': -2.3036145286208778, 'df': 43.071161614293338, 'test_result': Ttest_indResult(statistic=-8.0856541803709163, pvalue=3.5438757244843004e-10), 'n1': 22, 'n2': 28}

#### ('burger', 4) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.14935064935064934, 'test_result': MannwhitneyuResult(statistic=262.0, pvalue=0.18693288210180464), 'n2': 28}

#### ('burger', 4) vs ('swipe', 3)

{'N': 50, 'effect_size': 1.2621200986811547, 'df': 40.510976522970402, 'test_result': Ttest_indResult(statistic=4.430023567415585, pvalue=6.9900388209403688e-05), 'n1': 22, 'n2': 28}

#### ('burger', 4) vs ('swipe', 4)

{'N': 50, 'effect_size': 1.7720819828888703, 'df': 36.907897952812725, 'test_result': Ttest_indResult(statistic=6.2199825165556213, pvalue=3.1960770384704573e-07), 'n1': 22, 'n2': 28}

#### ('burger', 4) vs ('swipe', 5)

{'N': 50, 'effect_size': 2.6020850201949877, 'df': 32.52632637459962, 'test_result': Ttest_indResult(statistic=9.1332813540710109, pvalue=1.7051757569924315e-10), 'n1': 22, 'n2': 28}

#### ('burger', 5) vs ('swipe', 1)

{'N': 50, 'effect_size': -2.919842346861758, 'df': 37.431678148502876, 'test_result': Ttest_indResult(statistic=-10.248605044204545, pvalue=2.045361952158588e-12), 'n1': 22, 'n2': 28}

#### ('burger', 5) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.51623376623376616, 'test_result': MannwhitneyuResult(statistic=149.0, pvalue=0.0009750243017655867), 'n2': 28}

#### ('burger', 5) vs ('swipe', 3)

{'N': 50, 'effect_size': 0.67859393927802347, 'df': 46.852508622129029, 'test_result': Ttest_indResult(statistic=2.3818550602659152, pvalue=0.021339025726255848), 'n1': 22, 'n2': 28}

#### ('burger', 5) vs ('swipe', 4)

{'N': 50, 'effect_size': 1.2662092998006793, 'df': 44.248400605855807, 'test_result': Ttest_indResult(statistic=4.4443766050942699, pvalue=5.8417405173783915e-05), 'n1': 22, 'n2': 28}

#### ('burger', 5) vs ('swipe', 5)

{'N': 50, 'effect_size': 2.2701377982054178, 'df': 39.442494949086644, 'test_result': Ttest_indResult(statistic=7.9681513334901224, pvalue=9.6399894615656076e-10), 'n1': 22, 'n2': 28}

#### ('swipe', 1) vs ('swipe', 2)

{'N': 56, 'n1': 28, 'effect_size': 0.0019126554032515141, 'test_result': WilcoxonResult(statistic=3.0, pvalue=5.2564133258508337e-06), 'n2': 28}

#### ('swipe', 1) vs ('swipe', 3)

{'N': 56, 'effect_size': 2.465013782429549, 'df': 27, 'test_result': Ttest_relResult(statistic=13.043626893310529, pvalue=3.5969964456561358e-13), 'n1': 28, 'n2': 28}

#### ('swipe', 1) vs ('swipe', 4)

{'N': 56, 'effect_size': 2.743519328387984, 'df': 27, 'test_result': Ttest_relResult(statistic=14.517339720027108, pvalue=2.8328302970398919e-14), 'n1': 28, 'n2': 28}

#### ('swipe', 1) vs ('swipe', 5)

{'N': 56, 'effect_size': 3.2504934436751336, 'df': 27, 'test_result': Ttest_relResult(statistic=17.199994580420682, pvalue=4.4867434987762781e-16), 'n1': 28, 'n2': 28}

#### ('swipe', 2) vs ('swipe', 3)

{'N': 56, 'n1': 28, 'effect_size': 0.01912655403251514, 'test_result': WilcoxonResult(statistic=30.0, pvalue=8.1666493089205386e-05), 'n2': 28}

#### ('swipe', 2) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.010200828817341408, 'test_result': WilcoxonResult(statistic=16.0, pvalue=2.0602777134809463e-05), 'n2': 28}

#### ('swipe', 2) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.0031877590054191903, 'test_result': WilcoxonResult(statistic=5.0, pvalue=6.5213205645443688e-06), 'n2': 28}

#### ('swipe', 3) vs ('swipe', 4)

{'N': 56, 'effect_size': 0.39642879994718772, 'df': 27, 'test_result': Ttest_relResult(statistic=2.0977040344080686, pvalue=0.04542748458455511), 'n1': 28, 'n2': 28}

#### ('swipe', 3) vs ('swipe', 5)

{'N': 56, 'effect_size': 0.9589719197604063, 'df': 27, 'test_result': Ttest_relResult(statistic=5.0744024279604449, pvalue=2.493775482784069e-05), 'n1': 28, 'n2': 28}

#### ('swipe', 4) vs ('swipe', 5)

{'N': 56, 'effect_size': 0.78096126412132294, 'df': 27, 'test_result': Ttest_relResult(statistic=4.1324585768793005, pvalue=0.00031147549191696151), 'n1': 28, 'n2': 28}

### Global Burger vs Swipe per tid Tests (efficiency)

#### burger vs swipe 1

{'N': 138, 'effect_size': -1.9870466939513429, 'df': 32.196906556146352, 'test_result': Ttest_indResult(statistic=-9.3873689639224214, pvalue=9.7956596089961892e-11), 'n1': 110, 'n2': 28}

#### burger vs swipe 2

{'N': 138, 'n1': 110, 'effect_size': 0.18571428571428572, 'test_result': MannwhitneyuResult(statistic=1254.0, pvalue=0.065327534078559346), 'n2': 28}

#### burger vs swipe 3

{'N': 138, 'effect_size': 1.1700510299170281, 'df': 55.333617103825162, 'test_result': Ttest_indResult(statistic=5.5276510400502614, pvalue=9.0622300016681276e-07), 'n1': 110, 'n2': 28}

#### burger vs swipe 4

{'N': 138, 'effect_size': 1.7700005632660121, 'df': 64.460648478482284, 'test_result': Ttest_indResult(statistic=8.3619818317844903, pvalue=7.0554228434676112e-12), 'n1': 110, 'n2': 28}

#### burger vs swipe 5

{'N': 138, 'effect_size': 2.8251881603681546, 'df': 80.786408371513843, 'test_result': Ttest_indResult(statistic=13.346985621733216, pvalue=3.9194832679581521e-22), 'n1': 110, 'n2': 28}

### Global Burger vs Global Swipe Test (efficiency)

#### burger vs swipe

{'N': 250, 'n1': 110, 'effect_size': 0.2218181818181818, 'test_result': MannwhitneyuResult(statistic=5992.0, pvalue=0.0013125763723938479), 'n2': 140}

## Effectiveness by Tasks

### Descriptions (effectiveness)

#### Global Descriptions (effectiveness)

##### burger

|  |effectiveness |
| -|------------- |
| count|110.0 |
| mean|0.978181818182 |
| std|0.0626360071457 |
| min|0.8 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.3595287799835205, 8.873730593883483e-20)

##### swipe

|  |effectiveness |
| -|------------- |
| count|140.0 |
| mean|0.934285714286 |
| std|0.105783427849 |
| min|0.6 |
| 25%|0.8 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.6147457361221313, 1.3754389831214409e-17)

#### Repeated measures (effectiveness)

##### burger

| KruskalResult(statistic=4.2636054421768179, pvalue=0.37150463698880992)
| FriedmanchisquareResult(statistic=5.1111111111109082, pvalue=0.276085623834601)

##### swipe

| KruskalResult(statistic=8.4325646925437621, pvalue=0.076957851331098878)
| FriedmanchisquareResult(statistic=8.7192429022081477, pvalue=0.068513251264267688)

#### Descriptions per tid (effectiveness)

##### ('burger', 1)

|  |effectiveness |
| -|------------- |
| count|22.0 |
| mean|0.990909090909 |
| std|0.0426401432711 |
| min|0.8 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.22147256135940552, 7.41695094230721e-10)

##### ('burger', 2)

|  |effectiveness |
| -|------------- |
| count|22.0 |
| mean|0.963636363636 |
| std|0.0789542033952 |
| min|0.8 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.4735521674156189, 7.489492048762258e-08)

##### ('burger', 3)

|  |effectiveness |
| -|------------- |
| count|22.0 |
| mean|0.963636363636 |
| std|0.0789542033952 |
| min|0.8 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.4735521674156189, 7.489492048762258e-08)

##### ('burger', 4)

|  |effectiveness |
| -|------------- |
| count|22.0 |
| mean|0.981818181818 |
| std|0.0588489886336 |
| min|0.8 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.3322211503982544, 4.875188253095075e-09)

##### ('burger', 5)

|  |effectiveness |
| -|------------- |
| count|22.0 |
| mean|0.990909090909 |
| std|0.0426401432711 |
| min|0.8 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.22147256135940552, 7.41695094230721e-10)

##### ('swipe', 1)

|  |effectiveness |
| -|------------- |
| count|28.0 |
| mean|0.978571428571 |
| std|0.0629940788349 |
| min|0.8 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.36062484979629517, 5.463860475174442e-10)

##### ('swipe', 2)

|  |effectiveness |
| -|------------- |
| count|28.0 |
| mean|0.935714285714 |
| std|0.0951189731211 |
| min|0.8 |
| 25%|0.8 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.5905900597572327, 1.1246834219491575e-07)

##### ('swipe', 3)

|  |effectiveness |
| -|------------- |
| count|28.0 |
| mean|0.892857142857 |
| std|0.138586973437 |
| min|0.6 |
| 25%|0.8 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.7237528562545776, 6.2850517679180484e-06)

##### ('swipe', 4)

|  |effectiveness |
| -|------------- |
| count|28.0 |
| mean|0.942857142857 |
| std|0.0920087412456 |
| min|0.8 |
| 25%|0.8 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.5682951211929321, 6.229736015939125e-08)

##### ('swipe', 5)

|  |effectiveness |
| -|------------- |
| count|28.0 |
| mean|0.921428571429 |
| std|0.113389341903 |
| min|0.6 |
| 25%|0.8 |
| 50%|1.0 |
| 75%|1.0 |
| max|1.0 |

| shapiro
| (0.6656765341758728, 9.664669278208748e-07)

### Cross-compare Tests per tid (effectiveness)

#### ('burger', 1) vs ('burger', 2)

{'N': 44, 'n1': 22, 'effect_size': 0.0030975735673722249, 'test_result': WilcoxonResult(statistic=3.0, pvalue=0.17971249487899976), 'n2': 22}

#### ('burger', 1) vs ('burger', 3)

{'N': 44, 'n1': 22, 'effect_size': 0.0030975735673722249, 'test_result': WilcoxonResult(statistic=3.0, pvalue=0.17971249487899976), 'n2': 22}

#### ('burger', 1) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.0020650490449148169, 'test_result': WilcoxonResult(statistic=2.0, pvalue=0.5637028616507731), 'n2': 22}

#### ('burger', 1) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': '=== All pairs were equal ===', 'test_result': '=== All pairs were equal ===', 'n2': 22}

#### ('burger', 1) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.061688311688311681, 'test_result': MannwhitneyuResult(statistic=289.0, pvalue=0.22085511431458626), 'n2': 28}

#### ('burger', 1) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.27597402597402598, 'test_result': MannwhitneyuResult(statistic=223.0, pvalue=0.0085809342731982628), 'n2': 28}

#### ('burger', 1) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.38798701298701299, 'test_result': MannwhitneyuResult(statistic=188.5, pvalue=0.0011982167922993706), 'n2': 28}

#### ('burger', 1) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.24025974025974028, 'test_result': MannwhitneyuResult(statistic=234.0, pvalue=0.015452252565939647), 'n2': 28}

#### ('burger', 1) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.31331168831168832, 'test_result': MannwhitneyuResult(statistic=211.5, pvalue=0.0045566881958452573), 'n2': 28}

#### ('burger', 2) vs ('burger', 3)

{'N': 44, 'n1': 22, 'effect_size': 0.0051626226122870418, 'test_result': WilcoxonResult(statistic=5.0, pvalue=1.0), 'n2': 22}

#### ('burger', 2) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.15729920705028502), 'n2': 22}

#### ('burger', 2) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0030975735673722249, 'test_result': WilcoxonResult(statistic=3.0, pvalue=0.17971249487899976), 'n2': 22}

#### ('burger', 2) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.074675324675324672, 'test_result': MannwhitneyuResult(statistic=285.0, pvalue=0.23222527082050248), 'n2': 28}

#### ('burger', 2) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.13961038961038963, 'test_result': MannwhitneyuResult(statistic=265.0, pvalue=0.13717816505985114), 'n2': 28}

#### ('burger', 2) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.26623376623376627, 'test_result': MannwhitneyuResult(statistic=226.0, pvalue=0.025658789178159933), 'n2': 28}

#### ('burger', 2) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.10389610389610393, 'test_result': MannwhitneyuResult(statistic=276.0, pvalue=0.20268150101021792), 'n2': 28}

#### ('burger', 2) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.18181818181818177, 'test_result': MannwhitneyuResult(statistic=252.0, pvalue=0.082343202897603662), 'n2': 28}

#### ('burger', 3) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.0025813113061435209, 'test_result': WilcoxonResult(statistic=2.5, pvalue=0.31731050786291415), 'n2': 22}

#### ('burger', 3) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0030975735673722249, 'test_result': WilcoxonResult(statistic=3.0, pvalue=0.17971249487899976), 'n2': 22}

#### ('burger', 3) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.074675324675324672, 'test_result': MannwhitneyuResult(statistic=285.0, pvalue=0.23222527082050248), 'n2': 28}

#### ('burger', 3) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.13961038961038963, 'test_result': MannwhitneyuResult(statistic=265.0, pvalue=0.13717816505985114), 'n2': 28}

#### ('burger', 3) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.26623376623376627, 'test_result': MannwhitneyuResult(statistic=226.0, pvalue=0.025658789178159933), 'n2': 28}

#### ('burger', 3) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.10389610389610393, 'test_result': MannwhitneyuResult(statistic=276.0, pvalue=0.20268150101021792), 'n2': 28}

#### ('burger', 3) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.18181818181818177, 'test_result': MannwhitneyuResult(statistic=252.0, pvalue=0.082343202897603662), 'n2': 28}

#### ('burger', 4) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0020650490449148169, 'test_result': WilcoxonResult(statistic=2.0, pvalue=0.5637028616507731), 'n2': 22}

#### ('burger', 4) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.016233766233766267, 'test_result': MannwhitneyuResult(statistic=303.0, pvalue=0.43281068947535356), 'n2': 28}

#### ('burger', 4) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.23051948051948057, 'test_result': MannwhitneyuResult(statistic=237.0, pvalue=0.027429809187369383), 'n2': 28}

#### ('burger', 4) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.34740259740259738, 'test_result': MannwhitneyuResult(statistic=201.0, pvalue=0.0040041913682163349), 'n2': 28}

#### ('burger', 4) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.19480519480519476, 'test_result': MannwhitneyuResult(statistic=248.0, pvalue=0.046661220530755103), 'n2': 28}

#### ('burger', 4) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.26948051948051943, 'test_result': MannwhitneyuResult(statistic=225.0, pvalue=0.014890923602395365), 'n2': 28}

#### ('burger', 5) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.061688311688311681, 'test_result': MannwhitneyuResult(statistic=289.0, pvalue=0.22085511431458626), 'n2': 28}

#### ('burger', 5) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.27597402597402598, 'test_result': MannwhitneyuResult(statistic=223.0, pvalue=0.0085809342731982628), 'n2': 28}

#### ('burger', 5) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.38798701298701299, 'test_result': MannwhitneyuResult(statistic=188.5, pvalue=0.0011982167922993706), 'n2': 28}

#### ('burger', 5) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.24025974025974028, 'test_result': MannwhitneyuResult(statistic=234.0, pvalue=0.015452252565939647), 'n2': 28}

#### ('burger', 5) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.31331168831168832, 'test_result': MannwhitneyuResult(statistic=211.5, pvalue=0.0045566881958452573), 'n2': 28}

#### ('swipe', 1) vs ('swipe', 2)

{'N': 56, 'n1': 28, 'effect_size': 0.0028689831048772712, 'test_result': WilcoxonResult(statistic=4.5, pvalue=0.033894853524689246), 'n2': 28}

#### ('swipe', 1) vs ('swipe', 3)

{'N': 56, 'n1': 28, 'effect_size': 0.0031877590054191903, 'test_result': WilcoxonResult(statistic=5.0, pvalue=0.0050991474349813982), 'n2': 28}

#### ('swipe', 1) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.011475932419509085, 'test_result': WilcoxonResult(statistic=18.0, pvalue=0.13166801602281422), 'n2': 28}

#### ('swipe', 1) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.0070130698119222189, 'test_result': WilcoxonResult(statistic=11.0, pvalue=0.032509444645719511), 'n2': 28}

#### ('swipe', 2) vs ('swipe', 3)

{'N': 56, 'n1': 28, 'effect_size': 0.01912655403251514, 'test_result': WilcoxonResult(statistic=30.0, pvalue=0.13458487139107694), 'n2': 28}

#### ('swipe', 2) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.026777175645521199, 'test_result': WilcoxonResult(statistic=42.0, pvalue=0.7815112949987133), 'n2': 28}

#### ('swipe', 2) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.033471469556901501, 'test_result': WilcoxonResult(statistic=52.5, pvalue=0.63735188823393707), 'n2': 28}

#### ('swipe', 3) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.022314313037934332, 'test_result': WilcoxonResult(statistic=35.0, pvalue=0.068594778422537167), 'n2': 28}

#### ('swipe', 3) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.036978004462862604, 'test_result': WilcoxonResult(statistic=58.0, pvalue=0.35511621808512916), 'n2': 28}

#### ('swipe', 4) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.01912655403251514, 'test_result': WilcoxonResult(statistic=30.0, pvalue=0.43857802608099983), 'n2': 28}

### Global Burger vs Swipe per tid Tests (effectiveness)

#### burger vs swipe 1

{'N': 138, 'n1': 110, 'effect_size': 0.0019480519480519209, 'test_result': MannwhitneyuResult(statistic=1537.0, pvalue=0.49020683242704011), 'n2': 28}

#### burger vs swipe 2

{'N': 138, 'n1': 110, 'effect_size': 0.21233766233766238, 'test_result': MannwhitneyuResult(statistic=1213.0, pvalue=0.0027313254754476467), 'n2': 28}

#### burger vs swipe 3

{'N': 138, 'n1': 110, 'effect_size': 0.33116883116883122, 'test_result': MannwhitneyuResult(statistic=1030.0, pvalue=2.0615949541882224e-05), 'n2': 28}

#### burger vs swipe 4

{'N': 138, 'n1': 110, 'effect_size': 0.17662337662337657, 'test_result': MannwhitneyuResult(statistic=1268.0, pvalue=0.0092023144768541426), 'n2': 28}

#### burger vs swipe 5

{'N': 138, 'n1': 110, 'effect_size': 0.25194805194805192, 'test_result': MannwhitneyuResult(statistic=1152.0, pvalue=0.00061159598135044442), 'n2': 28}

### Global Burger vs Global Swipe Test (effectiveness)

#### burger vs swipe

{'N': 250, 'n1': 110, 'effect_size': 0.19402597402597399, 'test_result': MannwhitneyuResult(statistic=6206.0, pvalue=0.00011462735661581992), 'n2': 140}

## Task Questionnaires

### Task Question 0

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

|  |result |
| -|------ |
| count|110.0 |
| mean|6.90909090909 |
| std|0.395976427467 |
| min|4.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.24518823623657227, 2.9252628439826945e-21)

###### swipe

|  |result |
| -|------ |
| count|140.0 |
| mean|6.83571428571 |
| std|0.458504203722 |
| min|5.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.39919018745422363, 1.5329055243220379e-21)

##### Repeated measures (result)

###### burger

| KruskalResult(statistic=2.4526192106750853, pvalue=0.65313967433502973)
| FriedmanchisquareResult(statistic=3.3103448275862144, pvalue=0.50729488262873967)

###### swipe

| KruskalResult(statistic=1.7694225721785437, pvalue=0.77807166799688021)
| FriedmanchisquareResult(statistic=5.0958904109588801, pvalue=0.27759929640181424)

##### Descriptions per tid (result)

###### ('burger', 1)

|  |result |
| -|------ |
| count|22.0 |
| mean|7.0 |
| std|0.0 |
| min|7.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (1.0, 1.0)

###### ('burger', 2)

|  |result |
| -|------ |
| count|22.0 |
| mean|6.90909090909 |
| std|0.294244943168 |
| min|6.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.3322211503982544, 4.875188253095075e-09)

###### ('burger', 3)

|  |result |
| -|------ |
| count|22.0 |
| mean|6.77272727273 |
| std|0.751621623515 |
| min|4.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.3419651389122009, 5.8100124711302215e-09)

###### ('burger', 4)

|  |result |
| -|------ |
| count|22.0 |
| mean|6.90909090909 |
| std|0.294244943168 |
| min|6.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.3322211503982544, 4.875188253095075e-09)

###### ('burger', 5)

|  |result |
| -|------ |
| count|22.0 |
| mean|6.95454545455 |
| std|0.213200716356 |
| min|6.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.22147256135940552, 7.41695094230721e-10)

###### ('swipe', 1)

|  |result |
| -|------ |
| count|28.0 |
| mean|6.85714285714 |
| std|0.448395139423 |
| min|5.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.365678608417511, 6.050620560138498e-10)

###### ('swipe', 2)

|  |result |
| -|------ |
| count|28.0 |
| mean|6.92857142857 |
| std|0.262265264156 |
| min|6.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.2873581051826477, 1.3197647141804936e-10)

###### ('swipe', 3)

|  |result |
| -|------ |
| count|28.0 |
| mean|6.82142857143 |
| std|0.475594865606 |
| min|5.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.43253177404403687, 2.463778070449507e-09)

###### ('swipe', 4)

|  |result |
| -|------ |
| count|28.0 |
| mean|6.82142857143 |
| std|0.475594865606 |
| min|5.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.43253177404403687, 2.463778070449507e-09)

###### ('swipe', 5)

|  |result |
| -|------ |
| count|28.0 |
| mean|6.75 |
| std|0.585314097381 |
| min|5.0 |
| 25%|7.0 |
| 50%|7.0 |
| 75%|7.0 |
| max|7.0 |

| shapiro
| (0.48425883054733276, 7.892020370547925e-09)

#### Cross-compare Tests per tid (result)

##### ('burger', 1) vs ('burger', 2)

{'N': 44, 'n1': 22, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.15729920705028502), 'n2': 22}

##### ('burger', 1) vs ('burger', 3)

{'N': 44, 'n1': 22, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.17971249487899976), 'n2': 22}

##### ('burger', 1) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.15729920705028502), 'n2': 22}

##### ('burger', 1) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.31731050786291415), 'n2': 22}

##### ('burger', 1) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.1071428571428571, 'test_result': MannwhitneyuResult(statistic=275.0, pvalue=0.061389171314485569), 'n2': 28}

##### ('burger', 1) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.071428571428571397, 'test_result': MannwhitneyuResult(statistic=286.0, pvalue=0.10790037602663682), 'n2': 28}

##### ('burger', 1) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.1428571428571429, 'test_result': MannwhitneyuResult(statistic=264.0, pvalue=0.035323810007342034), 'n2': 28}

##### ('burger', 1) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.1428571428571429, 'test_result': MannwhitneyuResult(statistic=264.0, pvalue=0.035323810007342034), 'n2': 28}

##### ('burger', 1) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.1785714285714286, 'test_result': MannwhitneyuResult(statistic=253.0, pvalue=0.020341356769343476), 'n2': 28}

##### ('burger', 2) vs ('burger', 3)

{'N': 44, 'n1': 22, 'effect_size': 0.0030975735673722249, 'test_result': WilcoxonResult(statistic=3.0, pvalue=0.46145098783336069), 'n2': 22}

##### ('burger', 2) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.0051626226122870418, 'test_result': WilcoxonResult(statistic=5.0, pvalue=1.0), 'n2': 22}

##### ('burger', 2) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0020650490449148169, 'test_result': WilcoxonResult(statistic=2.0, pvalue=0.5637028616507731), 'n2': 22}

##### ('burger', 2) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.019480519480519431, 'test_result': MannwhitneyuResult(statistic=302.0, pvalue=0.41814383343092509), 'n2': 28}

##### ('burger', 2) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.019480519480519431, 'test_result': MannwhitneyuResult(statistic=302.0, pvalue=0.40954587077471732), 'n2': 28}

##### ('burger', 2) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.055194805194805241, 'test_result': MannwhitneyuResult(statistic=291.0, pvalue=0.28360268156813595), 'n2': 28}

##### ('burger', 2) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.055194805194805241, 'test_result': MannwhitneyuResult(statistic=291.0, pvalue=0.28360268156813595), 'n2': 28}

##### ('burger', 2) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.094155844155844104, 'test_result': MannwhitneyuResult(statistic=279.0, pvalue=0.1776214834950835), 'n2': 28}

##### ('burger', 3) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.0015487867836861124, 'test_result': WilcoxonResult(statistic=1.5, pvalue=0.41421617824252521), 'n2': 22}

##### ('burger', 3) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.17971249487899976), 'n2': 22}

##### ('burger', 3) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.008116883116883078, 'test_result': MannwhitneyuResult(statistic=305.5, pvalue=0.47007151426311133), 'n2': 28}

##### ('burger', 3) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.025974025974025983, 'test_result': MannwhitneyuResult(statistic=300.0, pvalue=0.37768095297605236), 'n2': 28}

##### ('burger', 3) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.040584415584415612, 'test_result': MannwhitneyuResult(statistic=295.5, pvalue=0.3388315325050939), 'n2': 28}

##### ('burger', 3) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.040584415584415612, 'test_result': MannwhitneyuResult(statistic=295.5, pvalue=0.3388315325050939), 'n2': 28}

##### ('burger', 3) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.074675324675324672, 'test_result': MannwhitneyuResult(statistic=285.0, pvalue=0.23293475501797717), 'n2': 28}

##### ('burger', 4) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.31731050786291415), 'n2': 22}

##### ('burger', 4) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.019480519480519431, 'test_result': MannwhitneyuResult(statistic=302.0, pvalue=0.41814383343092509), 'n2': 28}

##### ('burger', 4) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.019480519480519431, 'test_result': MannwhitneyuResult(statistic=302.0, pvalue=0.40954587077471732), 'n2': 28}

##### ('burger', 4) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.055194805194805241, 'test_result': MannwhitneyuResult(statistic=291.0, pvalue=0.28360268156813595), 'n2': 28}

##### ('burger', 4) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.055194805194805241, 'test_result': MannwhitneyuResult(statistic=291.0, pvalue=0.28360268156813595), 'n2': 28}

##### ('burger', 4) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.094155844155844104, 'test_result': MannwhitneyuResult(statistic=279.0, pvalue=0.1776214834950835), 'n2': 28}

##### ('burger', 5) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.063311688311688319, 'test_result': MannwhitneyuResult(statistic=288.5, pvalue=0.21488485789583234), 'n2': 28}

##### ('burger', 5) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.025974025974025983, 'test_result': MannwhitneyuResult(statistic=300.0, pvalue=0.36081607462259746), 'n2': 28}

##### ('burger', 5) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.099025974025974017, 'test_result': MannwhitneyuResult(statistic=277.5, pvalue=0.12983938884427548), 'n2': 28}

##### ('burger', 5) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.099025974025974017, 'test_result': MannwhitneyuResult(statistic=277.5, pvalue=0.12983938884427548), 'n2': 28}

##### ('burger', 5) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.13636363636363635, 'test_result': MannwhitneyuResult(statistic=266.0, pvalue=0.07519977300947886), 'n2': 28}

##### ('swipe', 1) vs ('swipe', 2)

{'N': 56, 'n1': 28, 'effect_size': 0.00095632770162575704, 'test_result': WilcoxonResult(statistic=1.5, pvalue=0.41421617824252521), 'n2': 28}

##### ('swipe', 1) vs ('swipe', 3)

{'N': 56, 'n1': 28, 'effect_size': 0.0012751036021676761, 'test_result': WilcoxonResult(statistic=2.0, pvalue=0.5637028616507731), 'n2': 28}

##### ('swipe', 1) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.0012751036021676761, 'test_result': WilcoxonResult(statistic=2.0, pvalue=0.5637028616507731), 'n2': 28}

##### ('swipe', 1) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.083264516663550406), 'n2': 28}

##### ('swipe', 2) vs ('swipe', 3)

{'N': 56, 'n1': 28, 'effect_size': 0.0012751036021676761, 'test_result': WilcoxonResult(statistic=2.0, pvalue=0.25683925795785656), 'n2': 28}

##### ('swipe', 2) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.0012751036021676761, 'test_result': WilcoxonResult(statistic=2.0, pvalue=0.25683925795785656), 'n2': 28}

##### ('swipe', 2) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.0, 'test_result': WilcoxonResult(statistic=0.0, pvalue=0.058781721355358862), 'n2': 28}

##### ('swipe', 3) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': '=== All pairs were equal ===', 'test_result': '=== All pairs were equal ===', 'n2': 28}

##### ('swipe', 3) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.00095632770162575704, 'test_result': WilcoxonResult(statistic=1.5, pvalue=0.41421617824252521), 'n2': 28}

##### ('swipe', 4) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.00095632770162575704, 'test_result': WilcoxonResult(statistic=1.5, pvalue=0.41421617824252521), 'n2': 28}

#### Global Burger vs Swipe per tid Tests (result)

##### burger vs swipe 1

{'N': 138, 'n1': 110, 'effect_size': 0.043506493506493493, 'test_result': MannwhitneyuResult(statistic=1473.0, pvalue=0.21665236926243431), 'n2': 28}

##### burger vs swipe 2

{'N': 138, 'n1': 110, 'effect_size': 0.0064935064935064402, 'test_result': MannwhitneyuResult(statistic=1530.0, pvalue=0.45320928415997419), 'n2': 28}

##### burger vs swipe 3

{'N': 138, 'n1': 110, 'effect_size': 0.078571428571428625, 'test_result': MannwhitneyuResult(statistic=1419.0, pvalue=0.087083010808927386), 'n2': 28}

##### burger vs swipe 4

{'N': 138, 'n1': 110, 'effect_size': 0.078571428571428625, 'test_result': MannwhitneyuResult(statistic=1419.0, pvalue=0.087083010808927386), 'n2': 28}

##### burger vs swipe 5

{'N': 138, 'n1': 110, 'effect_size': 0.11558441558441557, 'test_result': MannwhitneyuResult(statistic=1362.0, pvalue=0.027199345369874211), 'n2': 28}

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

{'N': 250, 'n1': 110, 'effect_size': 0.064545454545454573, 'test_result': MannwhitneyuResult(statistic=7203.0, pvalue=0.046318608676750285), 'n2': 140}

### Task Question 1

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

|  |result |
| -|------ |
| count|110.0 |
| mean|1.89090909091 |
| std|1.80897585981 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|7.0 |

| shapiro
| (0.5440710783004761, 6.783648646543276e-17)

###### swipe

|  |result |
| -|------ |
| count|140.0 |
| mean|2.86428571429 |
| std|2.12964925773 |
| min|1.0 |
| 25%|1.0 |
| 50%|2.0 |
| 75%|4.0 |
| max|7.0 |

| shapiro
| (0.799676775932312, 1.4816165872302833e-12)

##### Repeated measures (result)

###### burger

| KruskalResult(statistic=0.78069084963312274, pvalue=0.94101782074422269)
| FriedmanchisquareResult(statistic=2.7575757575757125, pvalue=0.59917784877228941)

###### swipe

| KruskalResult(statistic=2.0615941350657225, pvalue=0.72443103796977781)
| FriedmanchisquareResult(statistic=5.4968553459119409, pvalue=0.24000603548291879)

##### Descriptions per tid (result)

###### ('burger', 1)

|  |result |
| -|------ |
| count|22.0 |
| mean|1.95454545455 |
| std|2.01133153544 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|7.0 |

| shapiro
| (0.5299234390258789, 2.541320327509311e-07)

###### ('burger', 2)

|  |result |
| -|------ |
| count|22.0 |
| mean|1.77272727273 |
| std|1.87545088374 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|7.0 |

| shapiro
| (0.4611632227897644, 5.790687396256544e-08)

###### ('burger', 3)

|  |result |
| -|------ |
| count|22.0 |
| mean|2.0 |
| std|1.74574312189 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|2.0 |
| max|6.0 |

| shapiro
| (0.6260440349578857, 2.5660463052190607e-06)

###### ('burger', 4)

|  |result |
| -|------ |
| count|22.0 |
| mean|1.77272727273 |
| std|1.54092792643 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|6.0 |

| shapiro
| (0.5682213306427002, 6.146745477053628e-07)

###### ('burger', 5)

|  |result |
| -|------ |
| count|22.0 |
| mean|1.95454545455 |
| std|1.98751514465 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|7.0 |

| shapiro
| (0.5327657461166382, 2.7092326604361006e-07)

###### ('swipe', 1)

|  |result |
| -|------ |
| count|28.0 |
| mean|2.75 |
| std|2.36682315602 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|4.25 |
| max|7.0 |

| shapiro
| (0.7217938303947449, 5.8795612858375534e-06)

###### ('swipe', 2)

|  |result |
| -|------ |
| count|28.0 |
| mean|2.67857142857 |
| std|2.21198036674 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|4.0 |
| max|7.0 |

| shapiro
| (0.7506808042526245, 1.617231646378059e-05)

###### ('swipe', 3)

|  |result |
| -|------ |
| count|28.0 |
| mean|2.82142857143 |
| std|2.16116517662 |
| min|1.0 |
| 25%|1.0 |
| 50%|2.0 |
| 75%|4.0 |
| max|7.0 |

| shapiro
| (0.7865198850631714, 6.232791929505765e-05)

###### ('swipe', 4)

|  |result |
| -|------ |
| count|28.0 |
| mean|2.85714285714 |
| std|1.87999774851 |
| min|1.0 |
| 25%|1.0 |
| 50%|3.0 |
| 75%|4.0 |
| max|7.0 |

| shapiro
| (0.8642818927764893, 0.0018409639596939087)

###### ('swipe', 5)

|  |result |
| -|------ |
| count|28.0 |
| mean|3.21428571429 |
| std|2.11445015806 |
| min|1.0 |
| 25%|1.0 |
| 50%|3.0 |
| 75%|4.0 |
| max|7.0 |

| shapiro
| (0.8491970896720886, 0.0009006079635582864)

#### Cross-compare Tests per tid (result)

##### ('burger', 1) vs ('burger', 2)

{'N': 44, 'n1': 22, 'effect_size': 0.0077439339184305631, 'test_result': WilcoxonResult(statistic=7.5, pvalue=1.0), 'n2': 22}

##### ('burger', 1) vs ('burger', 3)

{'N': 44, 'n1': 22, 'effect_size': 0.014455343314403717, 'test_result': WilcoxonResult(statistic=14.0, pvalue=0.56869370493349436), 'n2': 22}

##### ('burger', 1) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.0061951471347444498, 'test_result': WilcoxonResult(statistic=6.0, pvalue=0.68027954733445029), 'n2': 22}

##### ('burger', 1) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0051626226122870418, 'test_result': WilcoxonResult(statistic=5.0, pvalue=1.0), 'n2': 22}

##### ('burger', 1) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.1964285714285714, 'test_result': MannwhitneyuResult(statistic=247.5, pvalue=0.082098002975044604), 'n2': 28}

##### ('burger', 1) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.21590909090909094, 'test_result': MannwhitneyuResult(statistic=241.5, pvalue=0.066396878662638464), 'n2': 28}

##### ('burger', 1) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.30681818181818177, 'test_result': MannwhitneyuResult(statistic=213.5, pvalue=0.020092875062028004), 'n2': 28}

##### ('burger', 1) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.35551948051948057, 'test_result': MannwhitneyuResult(statistic=198.5, pvalue=0.010019521264436585), 'n2': 28}

##### ('burger', 1) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.37662337662337664, 'test_result': MannwhitneyuResult(statistic=192.0, pvalue=0.0068101408106697112), 'n2': 28}

##### ('burger', 2) vs ('burger', 3)

{'N': 44, 'n1': 22, 'effect_size': 0.0067114093959731542, 'test_result': WilcoxonResult(statistic=6.5, pvalue=0.39510806859049219), 'n2': 22}

##### ('burger', 2) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.010841507485802787, 'test_result': WilcoxonResult(statistic=10.5, pvalue=1.0), 'n2': 22}

##### ('burger', 2) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0092927207021166747, 'test_result': WilcoxonResult(statistic=9.0, pvalue=0.73888268036352733), 'n2': 22}

##### ('burger', 2) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.24512987012987009, 'test_result': MannwhitneyuResult(statistic=232.5, pvalue=0.038182542965196922), 'n2': 28}

##### ('burger', 2) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.2678571428571429, 'test_result': MannwhitneyuResult(statistic=225.5, pvalue=0.028699028147674787), 'n2': 28}

##### ('burger', 2) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.36850649350649356, 'test_result': MannwhitneyuResult(statistic=194.5, pvalue=0.0062373933525989578), 'n2': 28}

##### ('burger', 2) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.41720779220779225, 'test_result': MannwhitneyuResult(statistic=179.5, pvalue=0.0028888514521789059), 'n2': 28}

##### ('burger', 2) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.43831168831168832, 'test_result': MannwhitneyuResult(statistic=173.0, pvalue=0.001845925801493757), 'n2': 28}

##### ('burger', 3) vs ('burger', 4)

{'N': 44, 'n1': 22, 'effect_size': 0.0092927207021166747, 'test_result': WilcoxonResult(statistic=9.0, pvalue=0.3885437838475907), 'n2': 22}

##### ('burger', 3) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.013422818791946308, 'test_result': WilcoxonResult(statistic=13.0, pvalue=0.86456930168674195), 'n2': 22}

##### ('burger', 3) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.15422077922077926, 'test_result': MannwhitneyuResult(statistic=260.5, pvalue=0.14603135541294709), 'n2': 28}

##### ('burger', 3) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.16883116883116878, 'test_result': MannwhitneyuResult(statistic=256.0, pvalue=0.12750985422970523), 'n2': 28}

##### ('burger', 3) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.25324675324675328, 'test_result': MannwhitneyuResult(statistic=230.0, pvalue=0.049115891184390158), 'n2': 28}

##### ('burger', 3) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.30194805194805197, 'test_result': MannwhitneyuResult(statistic=215.0, pvalue=0.026326679220802538), 'n2': 28}

##### ('burger', 3) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.3392857142857143, 'test_result': MannwhitneyuResult(statistic=203.5, pvalue=0.014613622667340618), 'n2': 28}

##### ('burger', 4) vs ('burger', 5)

{'N': 44, 'n1': 22, 'effect_size': 0.0015487867836861124, 'test_result': WilcoxonResult(statistic=1.5, pvalue=0.19364643126922065), 'n2': 22}

##### ('burger', 4) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.22564935064935066, 'test_result': MannwhitneyuResult(statistic=238.5, pvalue=0.054909704407618581), 'n2': 28}

##### ('burger', 4) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.24350649350649356, 'test_result': MannwhitneyuResult(statistic=233.0, pvalue=0.044870412680933683), 'n2': 28}

##### ('burger', 4) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.3214285714285714, 'test_result': MannwhitneyuResult(statistic=209.0, pvalue=0.015775210433546256), 'n2': 28}

##### ('burger', 4) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.375, 'test_result': MannwhitneyuResult(statistic=192.5, pvalue=0.0070352388832014452), 'n2': 28}

##### ('burger', 4) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.40422077922077926, 'test_result': MannwhitneyuResult(statistic=183.5, pvalue=0.0040067153811422793), 'n2': 28}

##### ('burger', 5) vs ('swipe', 1)

{'N': 50, 'n1': 22, 'effect_size': 0.20129870129870131, 'test_result': MannwhitneyuResult(statistic=246.0, pvalue=0.077014874525015403), 'n2': 28}

##### ('burger', 5) vs ('swipe', 2)

{'N': 50, 'n1': 22, 'effect_size': 0.2191558441558441, 'test_result': MannwhitneyuResult(statistic=240.5, pvalue=0.063535812872022673), 'n2': 28}

##### ('burger', 5) vs ('swipe', 3)

{'N': 50, 'n1': 22, 'effect_size': 0.31331168831168832, 'test_result': MannwhitneyuResult(statistic=211.5, pvalue=0.01809715117525822), 'n2': 28}

##### ('burger', 5) vs ('swipe', 4)

{'N': 50, 'n1': 22, 'effect_size': 0.35551948051948057, 'test_result': MannwhitneyuResult(statistic=198.5, pvalue=0.010033737896491264), 'n2': 28}

##### ('burger', 5) vs ('swipe', 5)

{'N': 50, 'n1': 22, 'effect_size': 0.38149350649350644, 'test_result': MannwhitneyuResult(statistic=190.5, pvalue=0.0062419441538161761), 'n2': 28}

##### ('swipe', 1) vs ('swipe', 2)

{'N': 56, 'n1': 28, 'effect_size': 0.032196365954733824, 'test_result': WilcoxonResult(statistic=50.5, pvalue=0.89924291781309873), 'n2': 28}

##### ('swipe', 1) vs ('swipe', 3)

{'N': 56, 'n1': 28, 'effect_size': 0.020720433535224736, 'test_result': WilcoxonResult(statistic=32.5, pvalue=0.34939652545601385), 'n2': 28}

##### ('swipe', 1) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.025820847943895442, 'test_result': WilcoxonResult(statistic=40.5, pvalue=0.44742990778151448), 'n2': 28}

##### ('swipe', 1) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.021676761236850493, 'test_result': WilcoxonResult(statistic=34.0, pvalue=0.13211241836284676), 'n2': 28}

##### ('swipe', 2) vs ('swipe', 3)

{'N': 56, 'n1': 28, 'effect_size': 0.01912655403251514, 'test_result': WilcoxonResult(statistic=30.0, pvalue=0.4727619557115964), 'n2': 28}

##### ('swipe', 2) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.042715970672617148, 'test_result': WilcoxonResult(statistic=67.0, pvalue=0.6485210682667949), 'n2': 28}

##### ('swipe', 2) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.025183296142811604, 'test_result': WilcoxonResult(statistic=39.5, pvalue=0.1354274987516664), 'n2': 28}

##### ('swipe', 3) vs ('swipe', 4)

{'N': 56, 'n1': 28, 'effect_size': 0.038253108065030281, 'test_result': WilcoxonResult(statistic=60.0, pvalue=0.66730491249962687), 'n2': 28}

##### ('swipe', 3) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.016576346828179791, 'test_result': WilcoxonResult(statistic=26.0, pvalue=0.16753962672004419), 'n2': 28}

##### ('swipe', 4) vs ('swipe', 5)

{'N': 56, 'n1': 28, 'effect_size': 0.016576346828179791, 'test_result': WilcoxonResult(statistic=26.0, pvalue=0.30026522383277554), 'n2': 28}

#### Global Burger vs Swipe per tid Tests (result)

##### burger vs swipe 1

{'N': 138, 'n1': 110, 'effect_size': 0.20454545454545459, 'test_result': MannwhitneyuResult(statistic=1225.0, pvalue=0.017143625211004959), 'n2': 28}

##### burger vs swipe 2

{'N': 138, 'n1': 110, 'effect_size': 0.22305194805194806, 'test_result': MannwhitneyuResult(statistic=1196.5, pvalue=0.011075983661422355), 'n2': 28}

##### burger vs swipe 3

{'N': 138, 'n1': 110, 'effect_size': 0.31266233766233764, 'test_result': MannwhitneyuResult(statistic=1058.5, pvalue=0.00087828638876744818), 'n2': 28}

##### burger vs swipe 4

{'N': 138, 'n1': 110, 'effect_size': 0.36103896103896105, 'test_result': MannwhitneyuResult(statistic=984.0, pvalue=0.00018652482417813029), 'n2': 28}

##### burger vs swipe 5

{'N': 138, 'n1': 110, 'effect_size': 0.38798701298701299, 'test_result': MannwhitneyuResult(statistic=942.5, pvalue=6.5526352124271008e-05), 'n2': 28}

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

{'N': 250, 'n1': 110, 'effect_size': 0.29785714285714282, 'test_result': MannwhitneyuResult(statistic=5406.5, pvalue=2.9062055593999374e-06), 'n2': 140}

## Final Questionnaires

### Final Question 0

#### Just counts grouped by Results

| Navigation burger answered 1 stars:                                 16
| Navigation burger answered 2 stars:                                 4
| Navigation burger answered 4 stars:                                 1
| Navigation burger answered 5 stars:                                 1
| Navigation swipe answered 1 stars:                                 21
| Navigation swipe answered 2 stars:                                 4
| Navigation swipe answered 3 stars:                                 1
| Navigation swipe answered 4 stars:                                 1
| Navigation swipe answered 7 stars:                                 1

#### 0 Description

|  |result |
| -|------ |
| count|50.0 |
| mean|1.52 |
| std|1.18218062089 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.75 |
| max|7.0 |

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

|  |result |
| -|------ |
| count|22.0 |
| mean|1.5 |
| std|1.05785047102 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.75 |
| max|5.0 |

| shapiro
| (0.5448707342147827, 3.567666624348931e-07)

###### swipe

|  |result |
| -|------ |
| count|28.0 |
| mean|1.53571428571 |
| std|1.29048204766 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.25 |
| max|7.0 |

| shapiro
| (0.4864434003829956, 8.3034956688266e-09)

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

{'N': 50, 'n1': 22, 'effect_size': 0.017857142857142905, 'test_result': MannwhitneyuResult(statistic=302.5, pvalue=0.44941800310214225), 'n2': 28}

### Final Question 1

#### Just counts grouped by Results

| Navigation burger answered 1 stars:                                 13
| Navigation burger answered 2 stars:                                 3
| Navigation burger answered 4 stars:                                 1
| Navigation burger answered 5 stars:                                 4
| Navigation burger answered 6 stars:                                 1
| Navigation swipe answered 1 stars:                                 17
| Navigation swipe answered 2 stars:                                 8
| Navigation swipe answered 4 stars:                                 2
| Navigation swipe answered 6 stars:                                 1

#### 1 Description

|  |result |
| -|------ |
| count|50.0 |
| mean|1.92 |
| std|1.49611742418 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|2.0 |
| max|6.0 |

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

|  |result |
| -|------ |
| count|22.0 |
| mean|2.22727272727 |
| std|1.79766563398 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|3.5 |
| max|6.0 |

| shapiro
| (0.6886584758758545, 1.4087103409110568e-05)

###### swipe

|  |result |
| -|------ |
| count|28.0 |
| mean|1.67857142857 |
| std|1.18801332542 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|2.0 |
| max|6.0 |

| shapiro
| (0.6186860203742981, 2.4386196173509234e-07)

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

{'N': 50, 'n1': 22, 'effect_size': 0.087662337662337664, 'test_result': MannwhitneyuResult(statistic=281.0, pvalue=0.27788843237866634), 'n2': 28}

### Final Question 2

#### Just counts grouped by Results

| Navigation burger answered 1 stars:                                 17
| Navigation burger answered 2 stars:                                 5
| Navigation swipe answered 1 stars:                                 18
| Navigation swipe answered 2 stars:                                 5
| Navigation swipe answered 3 stars:                                 2
| Navigation swipe answered 4 stars:                                 2
| Navigation swipe answered 7 stars:                                 1

#### 2 Description

|  |result |
| -|------ |
| count|50.0 |
| mean|1.52 |
| std|1.09246024539 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|2.0 |
| max|7.0 |

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

|  |result |
| -|------ |
| count|22.0 |
| mean|1.22727272727 |
| std|0.428932027229 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|1.0 |
| max|2.0 |

| shapiro
| (0.5222699642181396, 2.1416671813767607e-07)

###### swipe

|  |result |
| -|------ |
| count|28.0 |
| mean|1.75 |
| std|1.37773297418 |
| min|1.0 |
| 25%|1.0 |
| 50%|1.0 |
| 75%|2.0 |
| max|7.0 |

| shapiro
| (0.6172786951065063, 2.343947329563889e-07)

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

{'N': 50, 'n1': 22, 'effect_size': 0.17045454545454541, 'test_result': MannwhitneyuResult(statistic=255.5, pvalue=0.10358134878107761), 'n2': 28}

### Final Question 3

#### Just counts grouped by Results

| Navigation burger answered 2 stars:                                 1
| Navigation burger answered 3 stars:                                 5
| Navigation burger answered 4 stars:                                 1
| Navigation burger answered 5 stars:                                 4
| Navigation burger answered 6 stars:                                 5
| Navigation burger answered 7 stars:                                 6
| Navigation swipe answered 1 stars:                                 1
| Navigation swipe answered 2 stars:                                 1
| Navigation swipe answered 3 stars:                                 3
| Navigation swipe answered 4 stars:                                 11
| Navigation swipe answered 5 stars:                                 5
| Navigation swipe answered 6 stars:                                 4
| Navigation swipe answered 7 stars:                                 3

#### 3 Description

|  |result |
| -|------ |
| count|50.0 |
| mean|4.78 |
| std|1.56869892794 |
| min|1.0 |
| 25%|4.0 |
| 50%|5.0 |
| 75%|6.0 |
| max|7.0 |

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

|  |result |
| -|------ |
| count|22.0 |
| mean|5.13636363636 |
| std|1.67034226733 |
| min|2.0 |
| 25%|3.25 |
| 50%|5.5 |
| 75%|6.75 |
| max|7.0 |

| shapiro
| (0.8708899021148682, 0.008132589980959892)

###### swipe

|  |result |
| -|------ |
| count|28.0 |
| mean|4.5 |
| std|1.45296631451 |
| min|1.0 |
| 25%|4.0 |
| 50%|4.0 |
| 75%|5.25 |
| max|7.0 |

| shapiro
| (0.9325721859931946, 0.07159832864999771)

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

{'N': 50, 'n1': 22, 'effect_size': 0.22564935064935066, 'test_result': MannwhitneyuResult(statistic=238.5, pvalue=0.084899251911718931), 'n2': 28}
