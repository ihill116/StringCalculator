package com.ihill;

import java.util.List;

/**
 * Isaak Hill 345-04-StringCalculator 1/26/18.
 */
public class StringCalculatorImpl implements StringCalculator {
    @Override
    public int add(String numbers) {
        int total=0;
        if(!numbers.isEmpty()) {

            total+=Integer.parseInt(numbers);
        }
        return total;
    }
}
