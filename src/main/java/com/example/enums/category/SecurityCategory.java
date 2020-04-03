package com.example.enums.category;

import com.example.enums.EnumUtils;

public enum SecurityCategory {
    STOCK(Security.Stock.class), BOND(Security.Bond.class);

    Security[] values;

    SecurityCategory(Class<? extends Security> security) {
        values = security.getEnumConstants();
    }

    interface Security {
        enum Stock implements Security {SHORT, LONG, MARGIN}

        enum Bond implements Security {MUNICIPAL, JUNK}
    }

    public Security randomSelect() {
        return EnumUtils.random(values);
    }

    public static void main(String[] args) {
        for (SecurityCategory sc : SecurityCategory.values()) {
            System.out.println(sc.randomSelect());
        }
    }
}
