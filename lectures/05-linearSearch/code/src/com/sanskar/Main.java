package com.sanskar;

public class Main {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28}; // Declare and initialize array
        int target = 19; // Define target value
        int ans = linearSearch(nums, target); // Call the linearSearch() Method
        int ans2 = linearSearch2(nums, target);
        boolean ans3 = linearSearch3(nums, target);
        System.out.println(ans); // it will print index
        System.out.println(ans2); // it will print element value
        System.out.println(ans3); // it will print true or false.

    }

    // search target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE; // it is for constant value.
        /*
        it might say that if a number does not exist it  return -1. it might be possible you know
        how know i that -1 exist in this or not.(-1 may be item in the array)
         */
    }



    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) { // arr.length  this is a variable
           return -1;  // Return -1 if the array is empty
            /*
               If the array has no elements, return -1.
               -1 is commonly used to indicate "not found".
             */
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index]; // temporarily stores the current item for checking.
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found

        return -1;  // if the loop finishes and no match  is found, return -1.
    }
}







































