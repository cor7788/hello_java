package com.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2019-12-23

        localDate = LocalDate.of(2020, 2, 14);
        System.out.println(localDate); // 2020-02-14

        // 将日期设置为后天，参数是long型。
        localDate = localDate.plusDays(2L);
        System.out.println(localDate); // 2020-02-16

        // 将日期设置为这个月的第一天
        int dayOfMonth = localDate.getDayOfMonth();
        localDate = localDate.minusDays(dayOfMonth - 1);
        System.out.println(localDate); // 2020-02-01

        // 获取星期几，1表示星期一
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 22:27:23.711

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2019-12-23T22:27:23.711
    }
}
