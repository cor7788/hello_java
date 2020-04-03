package com.example.enums;

/**
 * add method and filed to enum, you can even add main method
 * override toString() method
 */
public enum AnotherSize {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    AnotherSize(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    @Override
    public String toString() {
        String name = name();
        String lower = name.substring(1).toLowerCase();
        return name.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for(AnotherSize anotherSize : AnotherSize.values()) {
            System.out.println(anotherSize + ": " + anotherSize.getAbbreviation());
        }
    }
}
