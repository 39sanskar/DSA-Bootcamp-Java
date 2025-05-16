package com.sanskar;


public class PassingExample {
    public static void main(String[] args) {
        String name = "Sanskar Mishra";
        greet(name); // when this method is call .(Sanskar Mishra is passed over here) that will be replace by naam.
    }

    static void greet(String name) {
        System.out.println(name);

    }
}
