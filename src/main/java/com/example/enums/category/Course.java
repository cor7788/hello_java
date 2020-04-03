package com.example.enums.category;

import com.example.enums.EnumUtils;

import static com.example.enums.category.Food.*;

public enum Course {
    APPETIZER(Appetizer.class), MAIN_COURSE(MainCourse.class),
    DESSERT(Dessert.class), COFFEE(Coffee.class);

    private Food[] values;

    Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return EnumUtils.random(values);
    }

    public static void main(String[] args) {
        // 随机搭配一份菜单
        for (Course c : Course.values()) {
            Food food = c.randomSelection();
            System.out.println(food);
        }
    }
}
