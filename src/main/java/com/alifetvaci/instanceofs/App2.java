package com.alifetvaci.instanceofs;

public class App2 {

    public static void main(String[] args) {

        Object obj = "Hello World";

        // legal usage
        if (obj instanceof String s && !s.isBlank()) {
            System.out.println("String: " + s);
        }

        // cannot resolve symbol 's'
//        if (obj instanceof String s || !s.isBlank()) {
//            System.out.println("String: " + s);
//        }
    }
}
