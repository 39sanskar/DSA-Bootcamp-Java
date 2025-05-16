package com.sanskar;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5]; // initialisation how many numbers of array.
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;

        // internally oit stores something like this [23, 45, 233, 543, 3]
//        System.out.println(arr[3]);

        // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            /*
            it take input from the user.
             */
        }

//        for ( int i =0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
            /*
            it will be print the value.
             */

        for(int num : arr) { // for every element in array, print the element
            System.out.print(num + " "); // here num represents element of the array.
        }

//        System.out.println(arr[5]); // it throw an error index out of bound.
    }
}
