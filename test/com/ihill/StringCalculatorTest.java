package com.ihill;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Isaak Hill 345-02-StringCalculator 1/26/18.
 */
class StringCalculatorTest {

    private StringCalculatorImpl sc = new StringCalculatorImpl();

    @org.junit.jupiter.api.Test
    void addTest() {
        assertEquals(0, sc.add(""));
    }
}