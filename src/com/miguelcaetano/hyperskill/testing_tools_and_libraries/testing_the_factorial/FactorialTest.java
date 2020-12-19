package com.miguelcaetano.hyperskill.testing_tools_and_libraries.testing_the_factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    public void testNegativeCase() {
        assertEquals(-1, factorial.get(-1));
    }

    @Test
    public void testGetCase0() {
       assertEquals(1, factorial.get(0));
    }

    @Test
    public void testGetCase1() {
        assertEquals(1, factorial.get(1));
    }

    @Test
    public void testGetCase2() {
        assertEquals(2, factorial.get(2));
    }

    @Test
    public void testGetCase5() {
        assertEquals(120, factorial.get(5));
    }
}