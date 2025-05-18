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
            for (int j = i + 1; j > 0; j--) {
                /*
                   (start j=i+1, and j is always greater than 0, and j = j -1.)
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
