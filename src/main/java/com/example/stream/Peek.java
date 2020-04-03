package com.example.stream;

import java.util.Comparator;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Peek {
    public static void main(String[] args) {
        String str = "hello world, nice to meet you.";
        Pattern.compile("[ ,.]+").splitAsStream(str)
                .map( w -> w + " ")
                .peek( System.out::print )
                .map( String:: toUpperCase )
                .forEach( System.out::print );
        System.out.println();

        Pattern.compile("[ ,.]+").splitAsStream(str)
                .sorted(Comparator.naturalOrder())
                .map( w -> w + " " )
                .forEach( System.out::print );

    }
}
