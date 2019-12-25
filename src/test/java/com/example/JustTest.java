package com.example;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class JustTest {

    @Test
    public void testNumberFormat() {
        double v = 0.10;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.println(currencyInstance.format(v)); // ￥0.10
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        System.out.println(percentInstance.format(v)); // 10%
    }

    @Test
    public void testNull() {
        Object a = null;
        Object b = null;
        System.out.println(a == b); // true
        System.out.println(a.equals(b)); // 会抛出 NullPointerException
        System.out.println(Objects.equals(a, b)); // false
    }

    @Test
    public void testHashCode() {
        String a = null;
        // 会抛出 NullPointerException
        System.out.println(a.hashCode());
    }

    @Test
    public void testArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        String[] arr = new String[list.size()];
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testInteger() {
        // 返回数字的 x 进制表示，第二个参数表示 x 进制
        String s = Integer.toString(15, 16);
        System.out.println(s); // f
    }

    @Test
    public void testEnum() {
        System.out.println(Size.SMALL); // 返回枚举常量名：SMALL
        System.out.println(Size.MEDIUM.ordinal()); // 返回常量声明的位置，从 0 开始计数
    }

    @Test
    public void testClazz() {
        String a = "a";
        Class<? extends String> clazz = a.getClass();
        System.out.println(clazz.getName()); // "java.lang.String"

    }
}
