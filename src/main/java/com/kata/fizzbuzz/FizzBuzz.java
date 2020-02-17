package com.kata.fizzbuzz;

class FizzBuzz {

    private static final String FIZZ = "Fizz";

    String getFizzBuzz(int number) {
        if(isFizzNumber(number)) {
            return FIZZ;
        } else if (number == 5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isFizzNumber(int number) {
        return number % 3 == 0;
    }
}
