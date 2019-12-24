package com.example;

import java.util.Arrays;

public class JavaForTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("hello world");
        });
        thread.run();

        // 数字字面量可以加下划线，方便阅读
        int i = 1_000_234;
        System.out.println(i);

        // 演示复制数组的值
        int[] nums = {1, 2, 3, 4, 5};
        int[] arr = Arrays.copyOf(nums, 2);
        System.out.println(Arrays.toString(arr)); // [1,2]
    }
}
