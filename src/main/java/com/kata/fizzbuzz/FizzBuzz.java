package com.kata.fizzbuzz;

class FizzBuzz {

    private static final String FIZZ = "Fizz";

    String getFizzBuzz(int number) {
        if(number % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(number);
    }
}
