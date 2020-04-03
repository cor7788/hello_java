package com.example.enums;
import static com.example.enums.Spiciness.*;

public class Burrito {

    Spiciness degree;
    public Burrito(Spiciness degree) { this.degree = degree; }
    public String toString() { return "Burrito is " + degree; }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MILD));
        System.out.println(new Burrito(HOT));
    }
}
