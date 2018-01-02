echo off

del *.class

javac -Xlint:unchecked -cp .;C:\bookClasses Proj03.java
java -cp .;C:\bookClasses Proj03 3
pause