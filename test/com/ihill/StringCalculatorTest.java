package com.ihill;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Isaak Hill 345-02-StringCalculator 1/26/18.
 */
class StringCalculatorTest {

    private StringCalculatorImpl sc = new StringCalculatorImpl();

    @org.junit.jupiter.api.Test
    void addTest() {
        //Test for empty string
        assertEquals(0, sc.add(""));

        //Tests for 1 number in string
        assertEquals(0,sc.add("0"));
        assertEquals(5,sc.add("5"));
        assertEquals(50, sc.add("50"));
        assertEquals(500, sc.add("500"));

        //Tests for 2 numbers
        assertEquals(0,sc.add("0,0"));
        assertEquals(5,sc.add("0,5"));
        assertEquals(10,sc.add("5,5"));
        assertEquals(505,sc.add("5,500"));
    }
}