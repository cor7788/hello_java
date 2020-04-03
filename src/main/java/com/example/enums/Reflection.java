package com.example.enums;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * explore the mystery of values() method
 */
enum Explore { HERE, THERE }
public class Reflection {

    public static Set<String> analyse(Class<?> enumClass) {
        System.out.println("-----Analysing " + enumClass + " -----");

        System.out.println("Interfaces:");
        Type[] interfaces = enumClass.getGenericInterfaces();
        for(Type type: interfaces) {
            System.out.println(type);
        }

        System.out.println("SuperClass: " + enumClass.getSuperclass());

        System.out.print("Methods: ");
        TreeSet<String> methods = new TreeSet<String>();
        for(Method method: enumClass.getMethods()) {
            methods.add(method.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreResult = analyse(Explore.class);
        Set<String> enumResult = analyse(Enum.class);
        System.out.println("---------");
        System.out.println("Explore.containsAll(Enum): " + exploreResult.containsAll(enumResult));
        System.out.print("Explore.removeAll(Enum): ");
        exploreResult.removeAll(enumResult);
        System.out.println(exploreResult);
    }
}
