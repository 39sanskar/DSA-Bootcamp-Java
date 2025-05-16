package com.sanskar;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

     //   System.out.println("Hello World");
     //   System.out.println("Hello World");
     //   System.out.println("Hello World");
     //   System.out.println("Hello World");
     //   System.out.println("Hello World");

        /*
        Syntax of for loops:

        for (initialisation; condition; increment/decrement) {
             // body
        }


        // Q: Print numbers from 1 to 5



        for ( int num = 1; num <= 5; num += 1) {
            System.out.println(num);
        }

        */

          // Print number from 1 to n
             Scanner in = new Scanner(System.in);
           //  int n = in.nextInt();

    //       for (int num = 1; num <= n; num++){
    //         System.out.print(num + " ");
    //       }

          // while loops
         /*
            syntax:
            while (condition) {
                 // body
            }
          */

    //    int num = 1;

    //    while (num <= 5) {
    //        System.out.println(num);
    //        num += 1;
    //    }

        /*
        you need to run while loop when you dont know how many times is loop going to run
        eg: Keep taking input from a user till the user does not press X (use while loop)
         */


    // do-while loop Syntax
    /*
       do{
           // body
       } while (condition);

    */

//    int n = 1;
//    do {
//        System.out.println(n);
//        n++;
//    } while (n <= 5);


    /*
    do-while loop the program is going to execute at-least once. After that it will execute
    when the while condition is true.
     */


    int n = 1;
    do {
        System.out.println("Hello World");
    } while ( n != 1);



    }
}
