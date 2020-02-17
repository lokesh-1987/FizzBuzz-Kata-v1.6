package com.kata.fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzShouldReturn1For1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertThat(fizzBuzz.getFizzBuzz(1), Is.is(1));
    }

    @Test
    public void fizzBuzzShouldReturn2For2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertThat(fizzBuzz.getFizzBuzz(2), Is.is(2));
    }
}
