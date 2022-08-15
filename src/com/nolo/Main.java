package com.nolo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*
        Primitive data types
        VS.
        Non-primitive data types AKA Reference types
        */
        int a = 10;
        int b = a;
        a = 100;
        // expecting b = 10 because a and b are in different memory addresses...
        System.out.println("a = " + a + " - " + "b = " + b);
        // Let's try the same scenario using Reference data types
        Person alex = new Person("Alex");
        Person mariam = alex;
        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);
        alex.name = "Alexander";
        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
        mariam.name = "mariam";
        System.out.println("after changing mariam");
        System.out.println(alex.name + " " + mariam.name);
        }
        // This is a class we can use to create Reference types or Objects
     static class Person {
        String name;
        Person (String name){
            this.name = name;
        }
    }
}