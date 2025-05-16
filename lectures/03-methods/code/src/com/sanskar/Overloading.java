package com.sanskar;


public class Overloading {
    public static void main(String[] args) {
        fun(67);
//        fun("Sanskar Mishra");
       int ans = sum(3, 4);
        System.out.println(ans);
    }

    static int sum( int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }


    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun (String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}

/*
function overloading => two or more function have the same name can exist if the parameters are different.
either the no. of arguments should be different or the type of argument should be different.
 */

