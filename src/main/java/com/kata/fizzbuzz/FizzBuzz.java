package com.kata.fizzbuzz;

class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    String getFizzBuzz(int number) {
        if(isFizzNumber(number)) {
            return FIZZ;
        } else if (number %  5 == 0) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private boolean isFizzNumber(int number) {
        return number % 3 == 0;
    }
}
