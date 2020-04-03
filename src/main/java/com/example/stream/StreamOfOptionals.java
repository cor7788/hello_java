package com.example.stream;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

class Signal {
    private final String msg;
    private static Random random = new Random(47);

    public Signal(String s) {
        msg = s;
    }

    @Override
    public String toString() {
        return "Signal{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public static Signal more() {
        switch (random.nextInt(4)) {
            case 1:
                return new Signal("dot");
            case 2:
                return new Signal("dash");
            default: return null;
        }
    }

    public static Stream<Optional> stream() {
        return Stream.generate(Signal::more)
                .map(signal -> Optional.ofNullable(signal));
    }
}

public class StreamOfOptionals {
    public static void main(String[] args) {
        Signal.stream()
                .limit(10)
                .forEach(System.out::println);
        System.out.println("------------");

        Signal.stream()
                .limit(10)
                .filter( Optional::isPresent )
                .map( Optional::get )
                .forEach(System.out::println);
    }
}
