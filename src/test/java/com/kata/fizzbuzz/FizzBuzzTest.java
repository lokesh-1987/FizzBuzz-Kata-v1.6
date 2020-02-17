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
}
