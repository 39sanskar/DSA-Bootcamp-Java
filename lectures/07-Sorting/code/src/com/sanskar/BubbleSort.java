package com.sanskar;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-1, 7, -32, 0, 89};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean swapped;
        /*
         use void because it not return anything.
         */
        /*
         Important Point : if NO swap is occurring hence array is already sorted .
         */
        // run the steps n-1 times

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) { // here j is start from 1.
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program.
            if (!swapped) { // !false = true
                /*
                 if did not swap you should break.(when the swap value is false means the no swap occur in that case
                   the statement will be true  and it will break)
                 */
                break;

                /*
                 for i=0; NO swap occur it basically means the array is sorted do not check for i=1, i=2, ...
                     it simple break.
                 */
            }
        }
    }
}

/*
 Notes => Bubble sort Also known as -->exchange sort, sinking sort.
 idea: it is in every pass largest element is coming at the end.
 Time Complexity
 Best case: O(N)
 Worst Case: O(N^2)
 Space Complexity : O(1) // Constant (no extra space required)
 */
