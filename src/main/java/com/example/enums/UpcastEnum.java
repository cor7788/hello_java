package com.example.enums;

/**
 * the getEnumConstants() method of Class class
 */
enum Search { HITHER, YON }
public class UpcastEnum {
    public static void main(String[] args) {
        Enum e = Search.HITHER;
        for(Enum en: e.getClass().getEnumConstants())
            System.out.println(en);
    }
}
