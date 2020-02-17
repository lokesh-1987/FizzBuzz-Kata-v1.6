package com.kata.fizzbuzz;

public class FizzBuzzMain {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int number = 1; number <= 100 ; number++)
            System.out.println("FizzBuzz nos : " + fizzBuzz.getFizzBuzz(number));
    }
}
