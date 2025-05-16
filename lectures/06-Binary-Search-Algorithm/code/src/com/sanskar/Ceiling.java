// Ceiling of a number

/*
   In a sorted array, the ceiling of a target number is:

   "The smallest number in the array that is greater than or equal to the target."
   If no such number exists (i.e., the target is larger than the biggest element), return -1.
*/

// Package declaration
package com.sanskar;
/*
   This means the class Ceiling is in the package named com.sanskar. It helps in organizing the code.
 */


// Main method
public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);

        System.out.println(ans);
        /*
        Prints the result. For this example, 5 is printed (because arr[5] = 16 is the ceiling of 15).
        */

    }

    /*
      You define a sorted array arr.
      The target is 15.
      You call the ceiling() function to find the ceiling of 15 in arr.
      You print the index of the ceiling.
      */

    // Ceiling function
    static int ceiling(int[] arr, int target){
        /*
        This function returns the index of the smallest number >= target
         */

        // Edge case check
        if (target > arr[arr.length - 1]) {
            return -1;

        }
        /*
         If the target is larger than the last (largest) element in the array, there is no ceiling.
         So the function returns -1.
         Example: If target is 20, and array ends at 18, no ceiling exists.
         */

        // Binary Search initialization
        int start = 0;
        int end = arr.length - 1;
        /*
        You set up a binary search between indices start and end
         */
        while (start <= end) {

            /*
            The binary search continues as long as start is less than or equal to end.
             */

            // Mid-Point calculation
            int mid = start + (end - start) / 2; // new formula.
            /*
            This is a safe way to calculate the middle index.
            It avoids overflow that can happen with (start + end) / 2.
             */

            // Binary Search Conditions
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid] ) {
                start = mid + 1;
            } else {

                return mid; // target is exactly equal to arr[mid]
            }

        }
        /*
          If target < arr[mid]: Move left (end = mid - 1)
          If target > arr[mid]: Move right (start = mid + 1)
          If target == arr[mid]: Exact match! Return mid.

         */

        return start;
        /*
        This is the key trick:

        When the loop ends, start will be at the index of the smallest number ≥ target.
        Why? Because we moved start forward whenever arr[mid] < target.
        If target = 15:

         */

        /*
            | Loop      | mid       | arr[mid]  | Condition | Action              |
            | --------- | --------- | --------- | --------- | ------------------- |
            | 1         | 3         | 9         | 15 > 9    | start = mid + 1 = 4 |
            | 2         | 5         | 16        | 15 < 16   | end = mid - 1 = 4   |
            | 3         | 4         | 14        | 15 > 14   | start = mid + 1 = 5 |
            | Loop ends | start = 5 |           |           |                     |

         Return start = 5, which is index of 16.
         */


        /*
        🔁 Summary of Logic:

        If target > largest number, return -1.
        Use binary search to reduce time complexity to O(log n).
        When target is not found, start ends up at the ceiling position.
        Return start.

         */
    }
}
