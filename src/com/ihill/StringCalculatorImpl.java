package com.ihill;

import java.util.Arrays;
import java.util.List;

/**
 * Isaak Hill 345-04-StringCalculator 1/26/18.
 */
public class StringCalculatorImpl implements StringCalculator {
    @Override
    public int add(String numbers) {
        int total=0;
        List<String> items = Arrays.asList(numbers.split("\\s*,\\s*"));
        if(!numbers.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {
                total+=Integer.parseInt(items.get(i));
            }
        }
        return total;
    }
}
