package org.factoriaf5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(13));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(52));
    }

    @Test
    public void testNumber() {
        assertEquals("7", fizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testZero() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(0));
    }

    @Test
    public void testNegativeFizz() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(-3));
    }
}