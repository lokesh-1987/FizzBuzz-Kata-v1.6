package com.kata.fizzbuzz;

class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    String getFizzBuzz(int number) {
        if (number % (3 *5) == 0) {
            return FIZZ_BUZZ;
        } else if(isFizzNumber(number)) {
            return FIZZ;
        } else if (isBuzzNumber(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private boolean isBuzzNumber(int number) {
        return number %  5 == 0;
    }

    private boolean isFizzNumber(int number) {
        return number % 3 == 0;
    }
}
