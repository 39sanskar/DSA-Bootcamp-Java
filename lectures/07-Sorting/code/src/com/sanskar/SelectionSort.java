package com.sanskar;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, -32, 0, 78, 1};
         selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in the remaining array and swap with correct index.
            int last = arr.length - i - 1; //  This is last index
            /*
             initially if i=0; that we need to find the maximum item in the entire array.
             */
            int maxIndex = getMaxIndex(arr, 0, last);
            /*
              Create a function getMaxIndex and pass array, start index, last index.
             */

            swap(arr, maxIndex, last);
            /*
             here swap  (maxIndex) with (last-index).
             */
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++ ) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}


/*
 Time Complexity
 Worst Case: O(N^2)
 Best Case: O(N^2) it is finding the maximum element in the array.
 stable : No
 It performs will on small lists/ arrays
 idea => Select an element and put at its right position.
 there are two ways-
 1. Here it select minimum element  index and put at it correct index.
 2. Here it select maximum element index and put at it correct index.
 */
