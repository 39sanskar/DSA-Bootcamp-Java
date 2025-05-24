package com.sanskar;
import java.util.Scanner;
import java.util.Arrays;
public class MultiDimension {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
         */
        /*
        2-D Array is define with two brackets.
        number of columns are not necessary to specify. but adding the rows are mandatory.
        you add number of column as well but  it is not mandatory.
         */

        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];

//        int[][] arr2D = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, //1st index
//                {6, 7, 8, 9} // 2nd index
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // print number of rows
        // input
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) { // arr[row].length => length of that array.
                 arr[row][col] = in.nextInt();
            }
        }

        //Output
//        for ( int row = 0; row < arr.length; row++) {
//            // for each column in every row
//            for ( int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // After printing every single line it will print new line.
//        }


//        // Another way to print the output of the Array
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//            /*
//            every single individual element of  outside  the array is array itself.
//             */
//        }


        // using enhanced for loop
        for (int[] a : arr) { // int[] a  for every array in arr
            /*
            here data type is array itself
             */
            System.out.println(Arrays.toString(a));
        }
        in.close();
    }
}
