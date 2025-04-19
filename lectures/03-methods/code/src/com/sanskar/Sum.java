package com.sanskar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

//        int ans = sum2();
//        System.out.println(ans);

//        sum(); // call the sum function

        // non static sum() cannot be referenced from a static context.
        // static means it does not depend on the object.

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    /*
    Pass the value of number when you are calling the method in main() .
    we do that by a parameters.
     */
    static int sum3 (int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2(){ // it  return the integer.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1  + num2;
        return sum;

    }
   static  void sum() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);
    }
    /*

        access modifier (we will look in OOP) return_type name() {
            // body
            return statement;

     */
}
