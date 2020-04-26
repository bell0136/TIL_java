javac -encoding utf-8 FruitSalesMain3_2.java
md orange
copy FruitBuyer.class .\orange\FruitBuyer.class
copy FruitSeller.class .\orange\FruitSeller.class
del FruitBuyer.class
del FruitSeller.class
set classpath=.;.\orange
java FruitSalesMain3_2.java
pause