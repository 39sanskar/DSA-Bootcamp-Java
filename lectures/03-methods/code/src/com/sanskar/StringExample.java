package com.sanskar;

import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name  = in.next();

        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {  // it has return String.

        String greeting = "how are you";

        return greeting;
    }
}
