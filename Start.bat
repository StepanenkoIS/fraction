javac -encoding utf-8 Main.java
jar cvf Main.jar *.class
erase *.class
java -cp ".;Main.jar" Main
pause