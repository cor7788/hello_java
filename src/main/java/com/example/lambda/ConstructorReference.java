package com.example.lambda;

class Dog {
    String name;
    int age = -1;
    Dog() { name = "wangcai"; }
    Dog(String name) { this.name = name; }
    Dog(String name, int age) { this.name = name; this.age = age; }
}

interface MakeNoArgs {
    Dog make();
}

interface Make1Arg {
    Dog make(String name);
}

interface Make2Arg {
    Dog make(String name, int age);
}

public class ConstructorReference {
    public static void main(String[] args) {
        MakeNoArgs mng = Dog::new;
        Make1Arg m1a = Dog::new;
        Make2Arg m2a = Dog::new;

        Dog dog = mng.make();
        Dog dog1 = m1a.make("wangcai");
        Dog dog2 = m2a.make("wangcai", 1);
    }
}
