package com.sanskar;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void insertion(int[] arr) {
        for (int i=0; i < arr.length - 1; i++) { // (i <= arr.length -2)
            for (int j = i + 1; j > 0; j--) { // j is always greater than 0
                /*
                   (start j = i+1, and j is always greater than 0, and j = j -1.)
                */
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
                /*
                 whatever j  you at left hand side will already be sorted.
                 */
            }
        }
     }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*

Insertion Sort => try sorting is in like parts (Partially Sorting)
Complexity Analysis
Worst Case(descending order) => O(N^2)
Best Case => O(N) Linear
Stable
Adaptive => Steps get reduced if array is sorted.
Numbers of swaps reduced as compared to bubble sort
Used for smaller values of n => Works good when array is partially sorted
(it takes part in hybrid Sorting Algorithm => basically means that takes like merge sort, quick sort
and combine some part with insertion sort.)

 */
