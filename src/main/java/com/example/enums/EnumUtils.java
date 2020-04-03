package com.example.enums;

import java.util.Random;

/**
 * 随机获取一个枚举常量。
 */
public class EnumUtils {

    private static Random rand = new Random(47);

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }

    public static <T extends Enum<T>> T random(Class<T> clazz) {
        return random(clazz.getEnumConstants());
    }
}
