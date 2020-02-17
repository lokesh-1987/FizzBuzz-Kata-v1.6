package com.kata.fizzbuzz;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzzShouldReturn1For1() {
        Assert.assertThat(fizzBuzz.getFizzBuzz(1), Is.is(1));
    }

    @Test
    public void fizzBuzzShouldReturn2For2() {
        Assert.assertThat(fizzBuzz.getFizzBuzz(2), Is.is(2));
    }
}
