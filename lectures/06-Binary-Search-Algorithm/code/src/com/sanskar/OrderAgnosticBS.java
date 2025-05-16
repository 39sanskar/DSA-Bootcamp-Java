// Package Declaration
package com.sanskar;
// This line declares that your Java file is part of the package com.sanskar.

// Main Class Method
public class OrderAgnosticBS {
    public static void main(String[] args) {

        /*
        This defines a public class named OrderAgnosticBS.
        The main method is the entry point of the Java application.
         */


        // Input array is in Ascending Order
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;

        // Input array is in Descending Order
        int[] arr1 = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target1 = 22;

        /*
        You declare and initialize a sorted array (in ascending order).
        You are trying to find the index of the target value 22 in the array.
         */


        // Calling the Binary Search Function
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
        /*
        You call the orderAgnosticBS method and store the result in ans.
        Then, you print the index of the found target (if found).
         */

        int ans1 = orderAgnosticBS(arr1, target1);
        System.out.println(ans1);

    }

    // Method:  orderAgnosticBS
    // Parameters
    static int orderAgnosticBS(int[] arr, int target) {
        /*
        This is a static method so it can be called without creating an object.
        It takes an array of integers and a target integer to search for.
         */

        // Initialize Pointers
        int start = 0;
        int end = arr.length-1;
        /*
        start points to the beginning of the array.
        end points to the last element.

         */

        // Determine Sorting Order
        boolean isAsc = arr[start] < arr[end];


        // Binary Search Loop
        while (start <= end) {
            int mid = start + (end - start) / 2; // new formula.
            /*
            This loop runs as long as start is less than or equal to end.
            Mid is calculated with a safer formula to avoid integer overflow:
             (start + end) / 2 could overflow for large numbers.
            So we use: start + (end - start) / 2.

             */


            // Check for Match
            if (arr[mid] == target) {
                return mid;
            }
            /*
            If the middle element is equal to the target, return the index immediately.
             */


            // ascending Order
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
                /*
                If the array is ascending:
                If the target is less than mid value → search left.
                Else → search right.
                 */

            // Descending Order
            } else {
                if (target > arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
            /*
            If the array is descending:
            If the target is greater than mid value → search left.
            Else → search right.
             */

        }

        // Target Not Found
        return -1;  // This is only be executed when nothing has return so now.
        /*
        If the loop ends and the target is not found, return -1.

         */
    }
}
