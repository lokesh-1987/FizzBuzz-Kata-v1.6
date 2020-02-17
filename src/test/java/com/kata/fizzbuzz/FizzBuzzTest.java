package com.kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzzShouldReturn1For1() {
        assertThat(fizzBuzz.getFizzBuzz(1), is(1));
    }

    @Test
    public void fizzBuzzShouldReturn2For2() {
        assertThat(fizzBuzz.getFizzBuzz(2), is(2));
    }
}
