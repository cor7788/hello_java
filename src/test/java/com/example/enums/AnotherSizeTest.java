package com.example.enums;

import org.junit.Test;

public class AnotherSizeTest {

    @Test
    public void testAnotherSize() {
        System.out.println(AnotherSize.SMALL.toString());
        System.out.println(AnotherSize.SMALL.getAbbreviation());

        AnotherSize[] values = AnotherSize.values();
        for(AnotherSize anotherSize: values) {
            System.out.println(anotherSize);
        }
    }
}
