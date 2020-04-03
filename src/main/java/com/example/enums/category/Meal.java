package com.example.enums.category;

import com.example.enums.EnumUtils;

public enum Meal {
    APPETIZER(Food.Appetizer.class), MAIN_COURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class), COFFEE(Food.Coffee.class);

    private Food[] values;

    Meal(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return EnumUtils.random(values);
    }

    interface Food {
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }

        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
        }

        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
        }

        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
    }
}
