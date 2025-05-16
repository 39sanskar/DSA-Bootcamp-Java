package com.sanskar;

public class Shadowing {
    static int x = 90;  // this will be shadow at line 10
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x ; // (declaring) the class variable at line 4 is shadowed by this

        /*
        Scope will begin when value is initialised.
         */
        x = 40;  // initialise
        System.out.println(x); // 40
        fun();

    }

    static void fun() {
        System.out.println(x); //90
    }
}
/*
What is shadowing in java => it is basically a practise of using two variables with the same name within the
scope that overlaps.
the variable with the higher level scope is hidden.
scope will begin when value is initialised.

Shadowing begins actually when the local variable is declared.
 */

