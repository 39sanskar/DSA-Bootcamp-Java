package com.sanskar;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28};
        int target = 3; // this is a target element that you want to search
        System.out.println(linearSearch(arr, target, 1, 4));

    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for (int index = start; index <= end; index++) {
            // check for elements at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found

        return -1;  // if the loop finishes and no match  is found, return -1.

    }
}
