package com.example;

import org.junit.Test;

import java.text.NumberFormat;

public class JustTest {

    @Test
    public void testNumberFormat() {
        double v = 0.10;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.println(currencyInstance.format(v)); // ￥0.10
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        System.out.println(percentInstance.format(v)); // 10%
    }
}
