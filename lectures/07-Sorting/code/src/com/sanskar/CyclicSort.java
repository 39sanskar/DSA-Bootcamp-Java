package com.sanskar;
import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString((arr)));
    }

    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            /*
            For the Cyclic Sort property (array contains 1..n each once), the
            correct index of arr[i] is value‑1.
            • Example: value 3 belongs at index 2.
             */
            if (arr[i] != arr[correct]){ // If the element is not already in its correct slot, perform a swap.
                swap(arr, i , correct);
            } else {
                i++; // move ahead
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

/*
Algorithm Properties

| Property            | Value                                                     |
| --------------------| ----------------------------------------------------------|
| Input constraints   | Requires the array to hold all integers from 1 to n       |
                        with no duplicates.                                       |
| Time complexity     | O(n) — each index is visited at most once, and each swap  |
                        places at least one element into its final position.      |
| Space complexity    | O(1) — sorting is in‑place, using only constant extra     |
                          variables (`i`, `correct`, and `temp`).                 |

 */

/*

The method repeatedly places a value into its rightful “cycle” position and keeps
cycling misplaced values until the current index holds the correct number.

It is very efficient for “items are 1‒to‑n without gaps” scenarios (e.g., finding
missing numbers quickly).

 */

/*
Worst Case => O(N)
When given number from range 1 to N => use cyclic sort (given in the range)

*/

