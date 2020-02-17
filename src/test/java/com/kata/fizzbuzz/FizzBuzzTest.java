package com.kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private static final String ONE = "1";
    private static final String TWO = "2";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzzShouldReturn1For1() {
        assertThat(fizzBuzz.getFizzBuzz(1), is(ONE));
    }

    @Test
    public void fizzBuzzShouldReturn2For2() {
        assertThat(fizzBuzz.getFizzBuzz(2), is(TWO));
    }

    @Test
    public void fizzBuzzShouldReturnFizzFor3(){
        assertThat(fizzBuzz.getFizzBuzz(3), is(FIZZ));
    }

    @Test
    public void fizzBuzzShouldReturnFizzFor6(){
        assertThat(fizzBuzz.getFizzBuzz(6),is(FIZZ));
    }

    @Test
    public void fizzBuzzShouldReturnBuzzFor5() {
        assertThat(fizzBuzz.getFizzBuzz(5), is(BUZZ));
    }

    @Test
    public void fizzBuzzShouldReturnBuzzFor10() {
        assertThat(fizzBuzz.getFizzBuzz(10), is(BUZZ));
    }

    @Test
    public void fizzBuzzShouldReturnFizzBuzzFor15() {
        assertThat(fizzBuzz.getFizzBuzz(15), is(FIZZ_BUZZ));
    }
}
