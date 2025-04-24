package com.sanskar;

public class Main {

    public static void main(String[] args) {
        // Q: store a roll number
        int  a = 19;

        // Q: store a persons name
        String name = "Sanskar Mishra";

        // Q: store 5 roll numbers
        int roll1 = 23;
        int roll2 = 55;
        int roll3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:

//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros;  // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation actually here object is being created in the memory (heap)


//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);


        // using enhanced for loop
//        for (String element : arr) {
//            /* what is the datatype of every single element in the string.
//             that is string datatype
//             */
//            System.out.println(element);
//        }


    }
}