# The FizzBuzz problem

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

# Architecture

This application was designed as a standalone jar file and contains main class which, when, executed returns
	1.  The number
	2. "Fizz" for numbers that are multiples of 3
	3. "Buzz" for numbers that are multiples of 5
	4. "FizzBuzz" for numbers that are multiples of 15

# Execution

In order to run the application, follow the below steps,
    a) Open a terminal window
    b) Change directory to your maven project. You should be in a directory that contains pom.xml file.
    c) Run the following command: mvn exec:java -Dexec.mainClass="com.kata.fizzbuzz.FizzBuzzMain"