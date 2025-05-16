package com.sanskar;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 87, 89); // here pass any no of arguments.

        multiple(2, 3, "Sanskar", "Aman", "Raj" );

        demo( 2, 3, 5);

        demo("Aman", "Mishra");

//        demo(); // if i not pass any argument then it not know which is run it throw ambiguity.

    }

    static void multiple(int a, int b, String ...v) {
        /*
        sequence is important.
         */
        System.out.println(Arrays.toString(v));

    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));

        /*
        if you want to pass few integer over here but you do not know how many integer you are
        passing you just do (int ...v) whatever name you want to give i am giving v.
         */
    }
}
