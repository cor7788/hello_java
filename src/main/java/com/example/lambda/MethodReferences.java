package com.example.lambda;

interface Callable {
    void call(String value);
}

class Describe {
    void show(String msg) {
        System.out.println(msg);
    }
}

public class MethodReferences {

    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Describe describe = new Describe();
        Callable c = describe::show;
        c.call("hello lambda");

        Callable cc = Helper::assist;
        cc.call("hello helper");
    }
}
