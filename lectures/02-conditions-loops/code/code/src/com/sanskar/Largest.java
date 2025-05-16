package com.sanskar;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the 3 numbers

        /*

        if (a > b && a > c){
            System.out.println("a is the largest number");
        }
        else if (b > a && b > c) {
            System.out.println("b is the largest number");
        }
        else {
            System.out.println(" c is the largest number ");
        }

         */

        /*

        // interesting way
        int max = a;
        if (b > max) {
            max = b;
        }
        if ( c > max) {
            max = c;
        }
        System.out.println(max);

         */


        /*

        int max = 0;
        if ( a > b) {
            max = a;
        } else {
            max = b;
        }
        if ( c > max) {
            max = c;
        }
        System.out.println(max);

         */


        // Using Math.max() function.
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}

