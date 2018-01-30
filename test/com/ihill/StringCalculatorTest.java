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

        //Tests for an unknown amount of numbers
        assertEquals(0,sc.add("0,0,0,0,0,0,0,0,0"));
        assertEquals(1,sc.add("0,1,0,0,0,0,0,0,0"));
        assertEquals(15,sc.add("1,2,3,4,5"));
        assertEquals(111111,sc.add("1,10,100,1000,10000,100000"));

        //Tests for new line delimiter
        assertEquals(0, sc.add("0\n0"));
        assertEquals(5, sc.add("0\n5"));
        assertEquals(5, sc.add("1\n2,2"));
        assertEquals(50,sc.add("10\n10\n10\n10\n10"));

    }
}