Analysis
========

Preprocessing
-------------

-   experiment\_results.csv
-   task\_questionnaire\_results.csv
-   final\_questionnaire\_results.csv
-   demographic\_data\_fixed.csv

Dropping Task ID 0 (Training)

Asserting Absolute Distance Values!

Dataset Validation:\
dict\_items(\[('pid', True)\])

Adding success column based on\
`opt_interactions == interactions`\
in order to measure effectiveness.

Aggregating Task Groups

No normality test, *Forcing t-test*!

Demographics
------------

### age

count | 50.0 |\
mean | 24.1 |\
std | 2.90144228737 |\
min | 20.0 |\
25% | 22.0 |\
50% | 24.0 |\
75% | 25.0 |\
max | 35.0 |

### sex

('f', 29)\
('m', 21)

### job

('Agrarwissenschaften', 5)\
('Agribusiness', 1)\
('Betriebswirtschaftslehre', 1)\
('Biochemie', 1)\
('Biologie', 1)\
('Ernährungs- und Verbraucherökonomie', 2)\
('Finanzmathematik', 2)\
('Informatik / Nachhilfelehrer', 1)\
('Mathemathik / Chemie', 1)\
('Mathemathik / Deutsch / Psychologie', 1)\
('Mathemathik / Geologie', 1)\
('Mathemathik / Geschichte', 1)\
('Mathemathik / Philosophie', 1)\
('Mathemathik / Physik', 1)\
('Mathemathik / Sport', 1)\
('Mathematik', 4)\
('Mathematik / Informatik', 1)\
('Mathematik / Spanisch', 1)\
('Medizin', 1)\
('Musikwissenschaft / Philosophie', 1)\
('Physik', 1)\
('Politikwissenschaft / Ur- und Frühgeschichte', 1)\
('Psychologie', 4)\
('Rechtswissenschaften', 1)\
('Soziologie / Pädagogik', 1)\
('Volkswirtschaftslehre', 3)\
('Wirtschaftsinformatik', 6)\
('Wirtschaftsingenieur', 2)\
('Wirtschaftswissenschaften Profil: Handelslehrer', 1)

### smartphone

('None', 1)\
('android', 37)\
('nodroid', 12)

### comments

('Ich zweifle die Aussagekraft der Studie an, da die Navigation nur aus
„Wischen nach links“ und „Wischen nach rechts“ besteht.', 1)\
('Menü-Steuerung: nur 5/7 Steine da: Menü zum Ausklappen. besser: dauerhaft
ausgeklappt - &gt;1 Klick statt 2', 1)\
('Samsung', 1)\
('man könnte die Bedienung noch vereinfachen, indem man durch wischen von Tür
zu Tür kann', 1)\
('schön kurz :)', 1)

Efficiency by Tasks
-------------------

### Descriptions (time\_ms)

#### Global Descriptions (time\_ms)

##### burger

count | 110.0 |\
mean | 4638.11818182 |\
std | 1251.30839042 |\
min | 2974.8 |\
25% | 3871.7 |\
50% | 4375.3 |\
75% | 5029.45 |\
max | 11598.2 |

##### swipe

count | 140.0 |\
mean | 5105.28428571 |\
std | 1878.17462417 |\
min | 1941.8 |\
25% | 3672.2 |\
50% | 4950.3 |\
75% | 6415.4 |\
max | 10211.0 |

#### Repeated measures (time\_ms)

##### burger

friedmanchisquare\
FriedmanchisquareResult(statistic=32.618181818181824,
pvalue=1.4299671878258814e-06)

##### swipe

friedmanchisquare\
FriedmanchisquareResult(statistic=99.0, pvalue=1.6058853045998598e-20)

#### Descriptions per tid (time\_ms)

##### ('burger', 1)

count | 22.0 |\
mean | 3882.02727273 |\
std | 527.012396332 |\
min | 2974.8 |\
25% | 3558.45 |\
50% | 3802.0 |\
75% | 4053.1 |\
max | 5278.2 |

##### ('burger', 2)

count | 22.0 |\
mean | 4855.64545455 |\
std | 1865.02294323 |\
min | 3348.4 |\
25% | 3808.65 |\
50% | 4359.2 |\
75% | 4578.85 |\
max | 11598.2 |

##### ('burger', 3)

count | 22.0 |\
mean | 4923.24545455 |\
std | 1382.21854785 |\
min | 3571.0 |\
25% | 4064.05 |\
50% | 4597.1 |\
75% | 5142.0 |\
max | 8840.8 |

##### ('burger', 4)

count | 22.0 |\
mean | 4455.94545455 |\
std | 905.444160792 |\
min | 3286.4 |\
25% | 3905.6 |\
50% | 4331.4 |\
75% | 4714.1 |\
max | 7063.4 |

##### ('burger', 5)

count | 22.0 |\
mean | 5073.72727273 |\
std | 820.671220162 |\
min | 3920.4 |\
25% | 4413.7 |\
50% | 5098.7 |\
75% | 5444.1 |\
max | 6927.6 |

##### ('swipe', 1)

count | 28.0 |\
mean | 2770.21428571 |\
std | 883.229726299 |\
min | 1941.8 |\
25% | 2296.25 |\
50% | 2554.1 |\
75% | 2865.6 |\
max | 6413.4 |

##### ('swipe', 2)

count | 28.0 |\
mean | 4204.86428571 |\
std | 1330.36827878 |\
min | 3202.4 |\
25% | 3635.95 |\
50% | 3765.6 |\
75% | 4341.1 |\
max | 10211.0 |

##### ('swipe', 3)

count | 28.0 |\
mean | 5175.67857143 |\
std | 889.237003511 |\
min | 3899.8 |\
25% | 4701.9 |\
50% | 4908.9 |\
75% | 5396.35 |\
max | 7508.4 |

##### ('swipe', 4)

count | 28.0 |\
mean | 6123.01428571 |\
std | 1000.60964517 |\
min | 4474.6 |\
25% | 5388.2 |\
50% | 6092.4 |\
75% | 6559.75 |\
max | 9004.2 |

##### ('swipe', 5)

count | 28.0 |\
mean | 7252.65 |\
std | 1209.06568841 |\
min | 5476.8 |\
25% | 6350.65 |\
50% | 7014.5 |\
75% | 7972.85 |\
max | 9742.0 |

### Cross-compare Tests per tid (time\_ms)

#### ('burger', 1) vs ('burger', 2)

Ttest\_indResult(statistic=-2.3563195177391711, pvalue=0.026837278884186307)

#### ('burger', 1) vs ('burger', 3)

Ttest\_indResult(statistic=-3.301433946283804, pvalue=0.0027125795574595001)

#### ('burger', 1) vs ('burger', 4)

Ttest\_indResult(statistic=-2.5694784146812677, pvalue=0.014776818562442288)

#### ('burger', 1) vs ('burger', 5)

Ttest\_indResult(statistic=-5.7310272087258207, pvalue=1.619575495038546e-06)

#### ('burger', 1) vs ('swipe', 1)

Ttest\_indResult(statistic=5.525655178946943, pvalue=1.5606385613110783e-06)

#### ('burger', 1) vs ('swipe', 2)

Ttest\_indResult(statistic=-1.1723290649094888, pvalue=0.24856488796290888)

#### ('burger', 1) vs ('swipe', 3)

Ttest\_indResult(statistic=-6.3993981789936072, pvalue=7.9724158300247925e-08)

#### ('burger', 1) vs ('swipe', 4)

Ttest\_indResult(statistic=-10.188148275652745, pvalue=5.439990089157802e-13)

#### ('burger', 1) vs ('swipe', 5)

Ttest\_indResult(statistic=-13.237665385930107, pvalue=5.9225323858749191e-16)

#### ('burger', 2) vs ('burger', 3)

Ttest\_indResult(statistic=-0.13658733908869305, pvalue=0.89206466453949496)

#### ('burger', 2) vs ('burger', 4)

Ttest\_indResult(statistic=0.90428478729982431, pvalue=0.37296020948451281)

#### ('burger', 2) vs ('burger', 5)

Ttest\_indResult(statistic=-0.50200953800200332, pvalue=0.61947233251143197)

#### ('burger', 2) vs ('swipe', 1)

Ttest\_indResult(statistic=4.8359255609749709, pvalue=4.2125473853520774e-05)

#### ('burger', 2) vs ('swipe', 2)

Ttest\_indResult(statistic=1.3833419122019486, pvalue=0.17494100501752627)

#### ('burger', 2) vs ('swipe', 3)

Ttest\_indResult(statistic=-0.7413701299848785, pvalue=0.46454187716229001)

#### ('burger', 2) vs ('swipe', 4)

Ttest\_indResult(statistic=-2.8784301941746708, pvalue=0.0072545925884238503)

#### ('burger', 2) vs ('swipe', 5)

Ttest\_indResult(statistic=-5.226791632469804, pvalue=8.5505924685378881e-06)

#### ('burger', 3) vs ('burger', 4)

Ttest\_indResult(statistic=1.3264698536274679, pvalue=0.19298754003967386)

#### ('burger', 3) vs ('burger', 5)

Ttest\_indResult(statistic=-0.43908302535785698, pvalue=0.66336559371483139)

#### ('burger', 3) vs ('swipe', 1)

Ttest\_indResult(statistic=6.3571648071920661, pvalue=3.0020232680894862e-07)

#### ('burger', 3) vs ('swipe', 2)

Ttest\_indResult(statistic=1.8545296759181633, pvalue=0.070312092231193238)

#### ('burger', 3) vs ('swipe', 3)

Ttest\_indResult(statistic=-0.74411620702074921, pvalue=0.46190688560607351)

#### ('burger', 3) vs ('swipe', 4)

Ttest\_indResult(statistic=-3.4265122067108527, pvalue=0.0015129649145139965)

#### ('burger', 3) vs ('swipe', 5)

Ttest\_indResult(statistic=-6.246809276876113, pvalue=1.7488766168777819e-07)

#### ('burger', 4) vs ('burger', 5)

Ttest\_indResult(statistic=-2.3712017823763154, pvalue=0.022439198606544287)

#### ('burger', 4) vs ('swipe', 1)

Ttest\_indResult(statistic=6.6056084093457947, pvalue=4.0427235929602223e-08)

#### ('burger', 4) vs ('swipe', 2)

Ttest\_indResult(statistic=0.79210953047243815, pvalue=0.43226416168527215)

#### ('burger', 4) vs ('swipe', 3)

Ttest\_indResult(statistic=-2.8121063066469638, pvalue=0.0072755844001201123)

#### ('burger', 4) vs ('swipe', 4)

Ttest\_indResult(statistic=-6.1691350083954593, pvalue=1.4936455102198106e-07)

#### ('burger', 4) vs ('swipe', 5)

Ttest\_indResult(statistic=-9.3497352169762635, pvalue=2.2212559316573675e-12)

#### ('burger', 5) vs ('swipe', 1)

Ttest\_indResult(statistic=9.5259532617225542, pvalue=1.635108067592063e-12)

#### ('burger', 5) vs ('swipe', 2)

Ttest\_indResult(statistic=2.8365801198549723, pvalue=0.0067742486183969995)

#### ('burger', 5) vs ('swipe', 3)

Ttest\_indResult(statistic=-0.42024537609100726, pvalue=0.67623347978987391)

#### ('burger', 5) vs ('swipe', 4)

Ttest\_indResult(statistic=-4.0728963297471577, pvalue=0.00017339525839808439)

#### ('burger', 5) vs ('swipe', 5)

Ttest\_indResult(statistic=-7.5712623152822953, pvalue=1.1021397421496496e-09)

#### ('swipe', 1) vs ('swipe', 2)

Ttest\_indResult(statistic=-4.7539768115474192, pvalue=1.9277958319103575e-05)

#### ('swipe', 1) vs ('swipe', 3)

Ttest\_indResult(statistic=-10.155757926844741, pvalue=3.9477605935136406e-14)

#### ('swipe', 1) vs ('swipe', 4)

Ttest\_indResult(statistic=-13.292797007328522, pvalue=1.5386867713548604e-18)

#### ('swipe', 1) vs ('swipe', 5)

Ttest\_indResult(statistic=-15.840964357407147, pvalue=5.2738427470786794e-21)

#### ('swipe', 2) vs ('swipe', 3)

Ttest\_indResult(statistic=-3.2102763579032656, pvalue=0.0023895386287433032)

#### ('swipe', 2) vs ('swipe', 4)

Ttest\_indResult(statistic=-6.0972714212077932, pvalue=1.530158177005509e-07)

#### ('swipe', 2) vs ('swipe', 5)

Ttest\_indResult(statistic=-8.9711188218831523, pvalue=2.9883028277709045e-12)

#### ('swipe', 3) vs ('swipe', 4)

Ttest\_indResult(statistic=-3.7447127962772471, pvalue=0.0004447721009592019)

#### ('swipe', 3) vs ('swipe', 5)

Ttest\_indResult(statistic=-7.3226656615349466, pvalue=1.964762790267281e-09)

#### ('swipe', 4) vs ('swipe', 5)

Ttest\_indResult(statistic=-3.8087281736762768, pvalue=0.00036955600286607841)

### Global Burger vs Swipe per tid Tests (time\_ms)

#### burger vs swipe 1

Ttest\_indResult(statistic=9.1041662413255509, pvalue=9.0785323242450565e-13)

#### burger vs swipe 2

Ttest\_indResult(statistic=1.5568536163563869, pvalue=0.12737768689409917)

#### burger vs swipe 3

Ttest\_indResult(statistic=-2.6083151306412868, pvalue=0.011576605141943273)

#### burger vs swipe 4

Ttest\_indResult(statistic=-6.6411791244427185, pvalue=2.0450396905182598e-08)

#### burger vs swipe 5

Ttest\_indResult(statistic=-10.143077950466848, pvalue=5.6904115473258768e-13)

### Global Burger vs Global Swipe Test (time\_ms)

#### burger vs swipe

Ttest\_indResult(statistic=-2.3526231636818391, pvalue=0.019443291760453712)

Effectiveness by Tasks
----------------------

### Descriptions (success)

#### Global Descriptions (success)

##### burger

count | 110.0 |\
mean | 0.978181818182 |\
std | 0.0626360071457 |\
min | 0.8 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### swipe

count | 140.0 |\
mean | 0.934285714286 |\
std | 0.105783427849 |\
min | 0.6 |\
25% | 0.8 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

#### Repeated measures (success)

##### burger

friedmanchisquare\
FriedmanchisquareResult(statistic=5.1111111111109082, pvalue=0.276085623834601)

##### swipe

friedmanchisquare\
FriedmanchisquareResult(statistic=8.7192429022081477,
pvalue=0.068513251264267688)

#### Descriptions per tid (success)

##### ('burger', 1)

count | 22.0 |\
mean | 0.990909090909 |\
std | 0.0426401432711 |\
min | 0.8 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('burger', 2)

count | 22.0 |\
mean | 0.963636363636 |\
std | 0.0789542033952 |\
min | 0.8 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('burger', 3)

count | 22.0 |\
mean | 0.963636363636 |\
std | 0.0789542033952 |\
min | 0.8 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('burger', 4)

count | 22.0 |\
mean | 0.981818181818 |\
std | 0.0588489886336 |\
min | 0.8 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('burger', 5)

count | 22.0 |\
mean | 0.990909090909 |\
std | 0.0426401432711 |\
min | 0.8 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('swipe', 1)

count | 28.0 |\
mean | 0.978571428571 |\
std | 0.0629940788349 |\
min | 0.8 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('swipe', 2)

count | 28.0 |\
mean | 0.935714285714 |\
std | 0.0951189731211 |\
min | 0.8 |\
25% | 0.8 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('swipe', 3)

count | 28.0 |\
mean | 0.892857142857 |\
std | 0.138586973437 |\
min | 0.6 |\
25% | 0.8 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('swipe', 4)

count | 28.0 |\
mean | 0.942857142857 |\
std | 0.0920087412456 |\
min | 0.8 |\
25% | 0.8 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

##### ('swipe', 5)

count | 28.0 |\
mean | 0.921428571429 |\
std | 0.113389341903 |\
min | 0.6 |\
25% | 0.8 |\
50% | 1.0 |\
75% | 1.0 |\
max | 1.0 |

### Cross-compare Tests per tid (success)

#### ('burger', 1) vs ('burger', 2)

Ttest\_indResult(statistic=1.4255728899344782, pvalue=0.16358780899480721)

#### ('burger', 1) vs ('burger', 3)

Ttest\_indResult(statistic=1.4255728899344722, pvalue=0.1635878089948089)

#### ('burger', 1) vs ('burger', 4)

Ttest\_indResult(statistic=0.5867386940384649, pvalue=0.56082327307745627)

#### ('burger', 1) vs ('burger', 5)

Ttest\_indResult(statistic=0.0, pvalue=1.0)

#### ('burger', 1) vs ('swipe', 1)

Ttest\_indResult(statistic=0.82366846170589003, pvalue=0.41428064209770366)

#### ('burger', 1) vs ('swipe', 2)

Ttest\_indResult(statistic=2.7400353204522681, pvalue=0.0091946014470773128)

#### ('burger', 1) vs ('swipe', 3)

Ttest\_indResult(statistic=3.5367966020406145, pvalue=0.0012166207287807747)

#### ('burger', 1) vs ('swipe', 4)

Ttest\_indResult(statistic=2.4489928787964925, pvalue=0.018809724953796)

#### ('burger', 1) vs ('swipe', 5)

Ttest\_indResult(statistic=2.9849166866864385, pvalue=0.005066877024676052)

#### ('burger', 2) vs ('burger', 3)

Ttest\_indResult(statistic=-4.6637076279086357e-15, pvalue=0.99999999999999623)

#### ('burger', 2) vs ('burger', 4)

Ttest\_indResult(statistic=-0.86602540378444448, pvalue=0.39179588482667327)

#### ('burger', 2) vs ('burger', 5)

Ttest\_indResult(statistic=-1.4255728899344782, pvalue=0.16358780899480721)

#### ('burger', 2) vs ('swipe', 1)

Ttest\_indResult(statistic=-0.72439198309892927, pvalue=0.47308750654179754)

#### ('burger', 2) vs ('swipe', 2)

Ttest\_indResult(statistic=1.13380582248701, pvalue=0.26252717192400138)

#### ('burger', 2) vs ('swipe', 3)

Ttest\_indResult(statistic=2.2734112399558835, pvalue=0.027911615554138184)

#### ('burger', 2) vs ('swipe', 4)

Ttest\_indResult(statistic=0.85860431235098866, pvalue=0.39486327780313391)

#### ('burger', 2) vs ('swipe', 5)

Ttest\_indResult(statistic=1.5489367311677702, pvalue=0.12804879993894061)

#### ('burger', 3) vs ('burger', 4)

Ttest\_indResult(statistic=-0.86602540378443904, pvalue=0.39179588482667649)

#### ('burger', 3) vs ('burger', 5)

Ttest\_indResult(statistic=-1.4255728899344722, pvalue=0.1635878089948089)

#### ('burger', 3) vs ('swipe', 1)

Ttest\_indResult(statistic=-0.72439198309892372, pvalue=0.47308750654180076)

#### ('burger', 3) vs ('swipe', 2)

Ttest\_indResult(statistic=1.1338058224870142, pvalue=0.26252717192399971)

#### ('burger', 3) vs ('swipe', 3)

Ttest\_indResult(statistic=2.273411239955887, pvalue=0.027911615554137945)

#### ('burger', 3) vs ('swipe', 4)

Ttest\_indResult(statistic=0.8586043123509931, pvalue=0.39486327780313146)

#### ('burger', 3) vs ('swipe', 5)

Ttest\_indResult(statistic=1.548936731167774, pvalue=0.12804879993893969)

#### ('burger', 4) vs ('burger', 5)

Ttest\_indResult(statistic=-0.5867386940384649, pvalue=0.56082327307745627)

#### ('burger', 4) vs ('swipe', 1)

Ttest\_indResult(statistic=0.18772011355652787, pvalue=0.85191261940051899)

#### ('burger', 4) vs ('swipe', 2)

Ttest\_indResult(statistic=2.1031460160122153, pvalue=0.040982538230155942)

#### ('burger', 4) vs ('swipe', 3)

Ttest\_indResult(statistic=3.063328037911023, pvalue=0.0039982893426720014)

#### ('burger', 4) vs ('swipe', 4)

Ttest\_indResult(statistic=1.8170389194463148, pvalue=0.075687083399407801)

#### ('burger', 4) vs ('swipe', 5)

Ttest\_indResult(statistic=2.4319786539439705, pvalue=0.019328473504723491)

#### ('burger', 5) vs ('swipe', 1)

Ttest\_indResult(statistic=0.82366846170589003, pvalue=0.41428064209770366)

#### ('burger', 5) vs ('swipe', 2)

Ttest\_indResult(statistic=2.7400353204522681, pvalue=0.0091946014470773128)

#### ('burger', 5) vs ('swipe', 3)

Ttest\_indResult(statistic=3.5367966020406145, pvalue=0.0012166207287807747)

#### ('burger', 5) vs ('swipe', 4)

Ttest\_indResult(statistic=2.4489928787964925, pvalue=0.018809724953796)

#### ('burger', 5) vs ('swipe', 5)

Ttest\_indResult(statistic=2.9849166866864385, pvalue=0.005066877024676052)

#### ('swipe', 1) vs ('swipe', 2)

Ttest\_indResult(statistic=1.9877674693472367, pvalue=0.052697890488069769)

#### ('swipe', 1) vs ('swipe', 3)

Ttest\_indResult(statistic=2.9793811989685222, pvalue=0.0050312636920862601)

#### ('swipe', 1) vs ('swipe', 4)

Ttest\_indResult(statistic=1.694798048598096, pvalue=0.096626471720385576)

#### ('swipe', 1) vs ('swipe', 5)

Ttest\_indResult(statistic=2.3310860696574305, pvalue=0.024596655054722923)

#### ('swipe', 2) vs ('swipe', 3)

Ttest\_indResult(statistic=1.3491570401925495, pvalue=0.18364057349667903)

#### ('swipe', 2) vs ('swipe', 4)

Ttest\_indResult(statistic=-0.28560636718891863, pvalue=0.77627353626500772)

#### ('swipe', 2) vs ('swipe', 5)

Ttest\_indResult(statistic=0.51075391845524742, pvalue=0.61166797783873916)

#### ('swipe', 3) vs ('swipe', 4)

Ttest\_indResult(statistic=-1.5904831691285086, pvalue=0.11844067281091235)

#### ('swipe', 3) vs ('swipe', 5)

Ttest\_indResult(statistic=-0.84431705367635057, pvalue=0.40236278952334648)

#### ('swipe', 4) vs ('swipe', 5)

Ttest\_indResult(statistic=0.77651636653311584, pvalue=0.44097544120891707)

### Global Burger vs Swipe per tid Tests (success)

#### burger vs swipe 1

Ttest\_indResult(statistic=-0.029252746423380799, pvalue=0.97680275053100574)

#### burger vs swipe 2

Ttest\_indResult(statistic=2.2419897995561002, pvalue=0.031762405354738295)

#### burger vs swipe 3

Ttest\_indResult(statistic=3.1763199109248252, pvalue=0.0034532804986949521)

#### burger vs swipe 4

Ttest\_indResult(statistic=1.9213827594698381, pvalue=0.063192249558969904)

#### burger vs swipe 5

Ttest\_indResult(statistic=2.5512559484732256, pvalue=0.015832395055001371)

### Global Burger vs Global Swipe Test (success)

#### burger vs swipe

Ttest\_indResult(statistic=4.0827736426313646, pvalue=6.1281992339985695e-05)

Task Questionnaires
-------------------

### Task Question 0

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

count | 110.0 |\
mean | 6.90909090909 |\
std | 0.395976427467 |\
min | 4.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### swipe

count | 140.0 |\
mean | 6.83571428571 |\
std | 0.458504203722 |\
min | 5.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

##### Repeated measures (result)

###### burger

friedmanchisquare\
FriedmanchisquareResult(statistic=3.3103448275862144,
pvalue=0.50729488262873967)

###### swipe

friedmanchisquare\
FriedmanchisquareResult(statistic=5.0958904109588801,
pvalue=0.27759929640181424)

##### Descriptions per tid (result)

###### ('burger', 1)

count | 22.0 |\
mean | 7.0 |\
std | 0.0 |\
min | 7.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('burger', 2)

count | 22.0 |\
mean | 6.90909090909 |\
std | 0.294244943168 |\
min | 6.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('burger', 3)

count | 22.0 |\
mean | 6.77272727273 |\
std | 0.751621623515 |\
min | 4.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('burger', 4)

count | 22.0 |\
mean | 6.90909090909 |\
std | 0.294244943168 |\
min | 6.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('burger', 5)

count | 22.0 |\
mean | 6.95454545455 |\
std | 0.213200716356 |\
min | 6.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('swipe', 1)

count | 28.0 |\
mean | 6.85714285714 |\
std | 0.448395139423 |\
min | 5.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('swipe', 2)

count | 28.0 |\
mean | 6.92857142857 |\
std | 0.262265264156 |\
min | 6.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('swipe', 3)

count | 28.0 |\
mean | 6.82142857143 |\
std | 0.475594865606 |\
min | 5.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('swipe', 4)

count | 28.0 |\
mean | 6.82142857143 |\
std | 0.475594865606 |\
min | 5.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

###### ('swipe', 5)

count | 28.0 |\
mean | 6.75 |\
std | 0.585314097381 |\
min | 5.0 |\
25% | 7.0 |\
50% | 7.0 |\
75% | 7.0 |\
max | 7.0 |

#### Cross-compare Tests per tid (result)

##### ('burger', 1) vs ('burger', 2)

Ttest\_indResult(statistic=1.4491376746189426, pvalue=0.16206871193916272)

##### ('burger', 1) vs ('burger', 3)

Ttest\_indResult(statistic=1.4182715723279398, pvalue=0.17078161271838718)

##### ('burger', 1) vs ('burger', 4)

Ttest\_indResult(statistic=1.4491376746189426, pvalue=0.16206871193916272)

##### ('burger', 1) vs ('burger', 5)

Ttest\_indResult(statistic=1.0000000000000089, pvalue=0.32869468323645945)

##### ('burger', 1) vs ('swipe', 1)

Ttest\_indResult(statistic=1.6858544608470538, pvalue=0.1033481555997189)

##### ('burger', 1) vs ('swipe', 2)

Ttest\_indResult(statistic=1.4411533842457791, pvalue=0.16103934953023244)

##### ('burger', 1) vs ('swipe', 3)

Ttest\_indResult(statistic=1.9867985355975688, pvalue=0.057179118127154482)

##### ('burger', 1) vs ('swipe', 4)

Ttest\_indResult(statistic=1.9867985355975688, pvalue=0.057179118127154482)

##### ('burger', 1) vs ('swipe', 5)

Ttest\_indResult(statistic=2.2601124105026518, pvalue=0.03208842174489044)

##### ('burger', 2) vs ('burger', 3)

Ttest\_indResult(statistic=0.79240581569306312, pvalue=0.434959083634744)

##### ('burger', 2) vs ('burger', 4)

Ttest\_indResult(statistic=0.0, pvalue=1.0)

##### ('burger', 2) vs ('burger', 5)

Ttest\_indResult(statistic=-0.58673869403846191, pvalue=0.56082327307745816)

##### ('burger', 2) vs ('swipe', 1)

Ttest\_indResult(statistic=0.49271170229567274, pvalue=0.62452609288904781)

##### ('burger', 2) vs ('swipe', 2)

Ttest\_indResult(statistic=-0.24365889171012692, pvalue=0.80866695186899662)

##### ('burger', 2) vs ('swipe', 3)

Ttest\_indResult(statistic=0.79978792158211109, pvalue=0.42796667468869776)

##### ('burger', 2) vs ('swipe', 4)

Ttest\_indResult(statistic=0.79978792158211109, pvalue=0.42796667468869776)

##### ('burger', 2) vs ('swipe', 5)

Ttest\_indResult(statistic=1.2510600541476802, pvalue=0.2178987002569478)

##### ('burger', 3) vs ('burger', 4)

Ttest\_indResult(statistic=-0.79240581569306312, pvalue=0.434959083634744)

##### ('burger', 3) vs ('burger', 5)

Ttest\_indResult(statistic=-1.0915536458196295, pvalue=0.28570930736987338)

##### ('burger', 3) vs ('swipe', 1)

Ttest\_indResult(statistic=-0.46568478226137766, pvalue=0.64455504483952952)

##### ('burger', 3) vs ('swipe', 2)

Ttest\_indResult(statistic=-0.92910316007448612, pvalue=0.36170919252817291)

##### ('burger', 3) vs ('swipe', 3)

Ttest\_indResult(statistic=-0.26506842102661687, pvalue=0.7925715578816479)

##### ('burger', 3) vs ('swipe', 4)

Ttest\_indResult(statistic=-0.26506842102661687, pvalue=0.7925715578816479)

##### ('burger', 3) vs ('swipe', 5)

Ttest\_indResult(statistic=0.11672011558286063, pvalue=0.90768224442657708)

##### ('burger', 4) vs ('burger', 5)

Ttest\_indResult(statistic=-0.58673869403846191, pvalue=0.56082327307745816)

##### ('burger', 4) vs ('swipe', 1)

Ttest\_indResult(statistic=0.49271170229567274, pvalue=0.62452609288904781)

##### ('burger', 4) vs ('swipe', 2)

Ttest\_indResult(statistic=-0.24365889171012692, pvalue=0.80866695186899662)

##### ('burger', 4) vs ('swipe', 3)

Ttest\_indResult(statistic=0.79978792158211109, pvalue=0.42796667468869776)

##### ('burger', 4) vs ('swipe', 4)

Ttest\_indResult(statistic=0.79978792158211109, pvalue=0.42796667468869776)

##### ('burger', 4) vs ('swipe', 5)

Ttest\_indResult(statistic=1.2510600541476802, pvalue=0.2178987002569478)

##### ('burger', 5) vs ('swipe', 1)

Ttest\_indResult(statistic=1.0129210828495314, pvalue=0.31711639921326906)

##### ('burger', 5) vs ('swipe', 2)

Ttest\_indResult(statistic=0.38622696788057731, pvalue=0.70103791654914316)

##### ('burger', 5) vs ('swipe', 3)

Ttest\_indResult(statistic=1.3216640957475614, pvalue=0.193927451557106)

##### ('burger', 5) vs ('swipe', 4)

Ttest\_indResult(statistic=1.3216640957475614, pvalue=0.193927451557106)

##### ('burger', 5) vs ('swipe', 5)

Ttest\_indResult(statistic=1.7104014031978396, pvalue=0.095898470850199258)

##### ('swipe', 1) vs ('swipe', 2)

Ttest\_indResult(statistic=-0.72760687510900546, pvalue=0.47074919343997945)

##### ('swipe', 1) vs ('swipe', 3)

Ttest\_indResult(statistic=0.28912165479145496, pvalue=0.77359920204510002)

##### ('swipe', 1) vs ('swipe', 4)

Ttest\_indResult(statistic=0.28912165479145496, pvalue=0.77359920204510002)

##### ('swipe', 1) vs ('swipe', 5)

Ttest\_indResult(statistic=0.76892189194508209, pvalue=0.44551595328148408)

##### ('swipe', 2) vs ('swipe', 3)

Ttest\_indResult(statistic=1.0438803085865349, pvalue=0.30250767106524179)

##### ('swipe', 2) vs ('swipe', 4)

Ttest\_indResult(statistic=1.0438803085865349, pvalue=0.30250767106524179)

##### ('swipe', 2) vs ('swipe', 5)

Ttest\_indResult(statistic=1.4732338600612171, pvalue=0.14905035503113803)

##### ('swipe', 3) vs ('swipe', 4)

Ttest\_indResult(statistic=0.0, pvalue=1.0)

##### ('swipe', 3) vs ('swipe', 5)

Ttest\_indResult(statistic=0.50116144175073229, pvalue=0.61837946822394008)

##### ('swipe', 4) vs ('swipe', 5)

Ttest\_indResult(statistic=0.50116144175073229, pvalue=0.61837946822394008)

#### Global Burger vs Swipe per tid Tests (result)

##### burger vs swipe 1

Ttest\_indResult(statistic=0.55997233123865175, pvalue=0.57874985452460637)

##### burger vs swipe 2

Ttest\_indResult(statistic=-0.31266159062439741, pvalue=0.75558308779702033)

##### burger vs swipe 3

Ttest\_indResult(statistic=0.89922333067579296, pvalue=0.37433593164182521)

##### burger vs swipe 4

Ttest\_indResult(statistic=0.89922333067579296, pvalue=0.37433593164182521)

##### burger vs swipe 5

Ttest\_indResult(statistic=1.3611501176257312, pvalue=0.18254059625123423)

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

Ttest\_indResult(statistic=1.3562601440255169, pvalue=0.17626116218076363)

### Task Question 1

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

count | 110.0 |\
mean | 1.89090909091 |\
std | 1.80897585981 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 7.0 |

###### swipe

count | 140.0 |\
mean | 2.86428571429 |\
std | 2.12964925773 |\
min | 1.0 |\
25% | 1.0 |\
50% | 2.0 |\
75% | 4.0 |\
max | 7.0 |

##### Repeated measures (result)

###### burger

friedmanchisquare\
FriedmanchisquareResult(statistic=2.7575757575757125,
pvalue=0.59917784877228941)

###### swipe

friedmanchisquare\
FriedmanchisquareResult(statistic=5.4968553459119409,
pvalue=0.24000603548291879)

##### Descriptions per tid (result)

###### ('burger', 1)

count | 22.0 |\
mean | 1.95454545455 |\
std | 2.01133153544 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 7.0 |

###### ('burger', 2)

count | 22.0 |\
mean | 1.77272727273 |\
std | 1.87545088374 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 7.0 |

###### ('burger', 3)

count | 22.0 |\
mean | 2.0 |\
std | 1.74574312189 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 2.0 |\
max | 6.0 |

###### ('burger', 4)

count | 22.0 |\
mean | 1.77272727273 |\
std | 1.54092792643 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 6.0 |

###### ('burger', 5)

count | 22.0 |\
mean | 1.95454545455 |\
std | 1.98751514465 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 7.0 |

###### ('swipe', 1)

count | 28.0 |\
mean | 2.75 |\
std | 2.36682315602 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 4.25 |\
max | 7.0 |

###### ('swipe', 2)

count | 28.0 |\
mean | 2.67857142857 |\
std | 2.21198036674 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 4.0 |\
max | 7.0 |

###### ('swipe', 3)

count | 28.0 |\
mean | 2.82142857143 |\
std | 2.16116517662 |\
min | 1.0 |\
25% | 1.0 |\
50% | 2.0 |\
75% | 4.0 |\
max | 7.0 |

###### ('swipe', 4)

count | 28.0 |\
mean | 2.85714285714 |\
std | 1.87999774851 |\
min | 1.0 |\
25% | 1.0 |\
50% | 3.0 |\
75% | 4.0 |\
max | 7.0 |

###### ('swipe', 5)

count | 28.0 |\
mean | 3.21428571429 |\
std | 2.11445015806 |\
min | 1.0 |\
25% | 1.0 |\
50% | 3.0 |\
75% | 4.0 |\
max | 7.0 |

#### Cross-compare Tests per tid (result)

##### ('burger', 1) vs ('burger', 2)

Ttest\_indResult(statistic=0.31010458564086002, pvalue=0.75802244540869279)

##### ('burger', 1) vs ('burger', 3)

Ttest\_indResult(statistic=-0.080051859907446427, pvalue=0.93658374072558803)

##### ('burger', 1) vs ('burger', 4)

Ttest\_indResult(statistic=0.33657671342337503, pvalue=0.73822512878677493)

##### ('burger', 1) vs ('burger', 5)

Ttest\_indResult(statistic=0.0, pvalue=1.0)

##### ('burger', 1) vs ('swipe', 1)

Ttest\_indResult(statistic=-1.2837421053733327, pvalue=0.2054375873090272)

##### ('burger', 1) vs ('swipe', 2)

Ttest\_indResult(statistic=-1.2090139880073498, pvalue=0.23271472223326703)

##### ('burger', 1) vs ('swipe', 3)

Ttest\_indResult(statistic=-1.463852065048149, pvalue=0.14995179579288434)

##### ('burger', 1) vs ('swipe', 4)

Ttest\_indResult(statistic=-1.6208185434680238, pvalue=0.11224980129520724)

##### ('burger', 1) vs ('swipe', 5)

Ttest\_indResult(statistic=-2.1492165095182081, pvalue=0.03688815104511671)

##### ('burger', 2) vs ('burger', 3)

Ttest\_indResult(statistic=-0.41604800757760851, pvalue=0.6795040084428422)

##### ('burger', 2) vs ('burger', 4)

Ttest\_indResult(statistic=0.0, pvalue=1.0)

##### ('burger', 2) vs ('burger', 5)

Ttest\_indResult(statistic=-0.31207579904219773, pvalue=0.75653217927135352)

##### ('burger', 2) vs ('swipe', 1)

Ttest\_indResult(statistic=-1.6289142640148464, pvalue=0.10987883761813257)

##### ('burger', 2) vs ('swipe', 2)

Ttest\_indResult(statistic=-1.5659419487889481, pvalue=0.12397500203185813)

##### ('burger', 2) vs ('swipe', 3)

Ttest\_indResult(statistic=-1.8347896616603989, pvalue=0.072806163662061316)

##### ('burger', 2) vs ('swipe', 4)

Ttest\_indResult(statistic=-2.0273655509871724, pvalue=0.048533888623595652)

##### ('burger', 2) vs ('swipe', 5)

Ttest\_indResult(statistic=-2.550121168647193, pvalue=0.014070036183701212)

##### ('burger', 3) vs ('burger', 4)

Ttest\_indResult(statistic=0.45779999816880002, pvalue=0.64949206222919309)

##### ('burger', 3) vs ('burger', 5)

Ttest\_indResult(statistic=0.08059475790364122, pvalue=0.93615340884054188)

##### ('burger', 3) vs ('swipe', 1)

Ttest\_indResult(statistic=-1.2889066290162134, pvalue=0.20362802550896689)

##### ('burger', 3) vs ('swipe', 2)

Ttest\_indResult(statistic=-1.2123668735785071, pvalue=0.23130618790625015)

##### ('burger', 3) vs ('swipe', 3)

Ttest\_indResult(statistic=-1.4865530860485299, pvalue=0.14367932916113879)

##### ('burger', 3) vs ('swipe', 4)

Ttest\_indResult(statistic=-1.665827282358026, pvalue=0.10245606821048929)

##### ('burger', 3) vs ('swipe', 5)

Ttest\_indResult(statistic=-2.2236416215700405, pvalue=0.030927460331272798)

##### ('burger', 4) vs ('burger', 5)

Ttest\_indResult(statistic=-0.33910136104054245, pvalue=0.73632757197468268)

##### ('burger', 4) vs ('swipe', 1)

Ttest\_indResult(statistic=-1.7609344102128832, pvalue=0.084815434369215556)

##### ('burger', 4) vs ('swipe', 2)

Ttest\_indResult(statistic=-1.7037658302714056, pvalue=0.09497299007775549)

##### ('burger', 4) vs ('swipe', 3)

Ttest\_indResult(statistic=-2.0007469881640132, pvalue=0.051138917909208527)

##### ('burger', 4) vs ('swipe', 4)

Ttest\_indResult(statistic=-2.2409958289424603, pvalue=0.029698757129413455)

##### ('burger', 4) vs ('swipe', 5)

Ttest\_indResult(statistic=-2.7866677954802945, pvalue=0.0076168232047276047)

##### ('burger', 5) vs ('swipe', 1)

Ttest\_indResult(statistic=-1.2910409183090523, pvalue=0.20290434875885618)

##### ('burger', 5) vs ('swipe', 2)

Ttest\_indResult(statistic=-1.2163777102367443, pvalue=0.22990419438692747)

##### ('burger', 5) vs ('swipe', 3)

Ttest\_indResult(statistic=-1.4729715892618513, pvalue=0.14745914516885314)

##### ('burger', 5) vs ('swipe', 4)

Ttest\_indResult(statistic=-1.6322512563257097, pvalue=0.10976494840900448)

##### ('burger', 5) vs ('swipe', 5)

Ttest\_indResult(statistic=-2.1628863874669357, pvalue=0.035735733189624176)

##### ('swipe', 1) vs ('swipe', 2)

Ttest\_indResult(statistic=0.11667176816723937, pvalue=0.90755497563889476)

##### ('swipe', 1) vs ('swipe', 3)

Ttest\_indResult(statistic=-0.11792698212695876, pvalue=0.90656666165487043)

##### ('swipe', 1) vs ('swipe', 4)

Ttest\_indResult(statistic=-0.18756785365546197, pvalue=0.85195435322794189)

##### ('swipe', 1) vs ('swipe', 5)

Ttest\_indResult(statistic=-0.77408790290137819, pvalue=0.44229719902179665)

##### ('swipe', 2) vs ('swipe', 3)

Ttest\_indResult(statistic=-0.24444025311801382, pvalue=0.80781680136158207)

##### ('swipe', 2) vs ('swipe', 4)

Ttest\_indResult(statistic=-0.32549781971440689, pvalue=0.74609483697056533)

##### ('swipe', 2) vs ('swipe', 5)

Ttest\_indResult(statistic=-0.92637576511926945, pvalue=0.35838094161896383)

##### ('swipe', 3) vs ('swipe', 4)

Ttest\_indResult(statistic=-0.065975241937917109, pvalue=0.94764585285887681)

##### ('swipe', 3) vs ('swipe', 5)

Ttest\_indResult(statistic=-0.68754973774649286, pvalue=0.49468042451910721)

##### ('swipe', 4) vs ('swipe', 5)

Ttest\_indResult(statistic=-0.66793226421816831, pvalue=0.50706047845662638)

#### Global Burger vs Swipe per tid Tests (result)

##### burger vs swipe 1

Ttest\_indResult(statistic=-1.7920485696152606, pvalue=0.081668377626223213)

##### burger vs swipe 2

Ttest\_indResult(statistic=-1.7418063441047225, pvalue=0.089916422412057356)

##### burger vs swipe 3

Ttest\_indResult(statistic=-2.0988468236683779, pvalue=0.042676536020284629)

##### burger vs swipe 4

Ttest\_indResult(statistic=-2.446535421195474, pvalue=0.018837342914925163)

##### burger vs swipe 5

Ttest\_indResult(statistic=-3.0406465555493165, pvalue=0.0042798608827830081)

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

Ttest\_indResult(statistic=-3.9046179737739855, pvalue=0.00012188835447452269)

Final Questionnaires
--------------------

### Final Question 0

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

count | 22.0 |\
mean | 1.5 |\
std | 1.05785047102 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.75 |\
max | 5.0 |

###### swipe

count | 28.0 |\
mean | 1.53571428571 |\
std | 1.29048204766 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.25 |\
max | 7.0 |

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

Ttest\_indResult(statistic=-0.10751543495766284, pvalue=0.9148292292550424)

### Final Question 1

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

count | 22.0 |\
mean | 2.22727272727 |\
std | 1.79766563398 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 3.5 |\
max | 6.0 |

###### swipe

count | 28.0 |\
mean | 1.67857142857 |\
std | 1.18801332542 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 2.0 |\
max | 6.0 |

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

Ttest\_indResult(statistic=1.2353085848140299, pvalue=0.22501281363206999)

### Final Question 2

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

count | 22.0 |\
mean | 1.22727272727 |\
std | 0.428932027229 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 1.0 |\
max | 2.0 |

###### swipe

count | 28.0 |\
mean | 1.75 |\
std | 1.37773297418 |\
min | 1.0 |\
25% | 1.0 |\
50% | 1.0 |\
75% | 2.0 |\
max | 7.0 |

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

Ttest\_indResult(statistic=-1.8942147514189334, pvalue=0.066878319737774167)

### Final Question 3

#### Descriptions (result)

##### Global Descriptions (result)

###### burger

count | 22.0 |\
mean | 5.13636363636 |\
std | 1.67034226733 |\
min | 2.0 |\
25% | 3.25 |\
50% | 5.5 |\
75% | 6.75 |\
max | 7.0 |

###### swipe

count | 28.0 |\
mean | 4.5 |\
std | 1.45296631451 |\
min | 1.0 |\
25% | 4.0 |\
50% | 4.0 |\
75% | 5.25 |\
max | 7.0 |

#### Global Burger vs Global Swipe Test (result)

##### burger vs swipe

Ttest\_indResult(statistic=1.4151306918873736, pvalue=0.16442349507017537)