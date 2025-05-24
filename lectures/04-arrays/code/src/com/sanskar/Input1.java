package com.sanskar;
import java.util.Arrays;
import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
            // Array of object
            String[] str = new String[4]; // it's going to contain four objects in it.(heap)
            /*
            Basically containing the reference variable to the objects.
             */
            for(int i = 0; i < str.length; i++) {
                str[i] = in.next();

            }
            System.out.println(Arrays.toString(str));



            // modify
            str[1] = "Sanskar Mishra"; // here string 1 is change to Sanskar Mishra.

            System.out.println(Arrays.toString(str));
        

        // Another way to print the array
        // input using for loops

        // Array of primitives
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
         
         in.close();


    }

}


