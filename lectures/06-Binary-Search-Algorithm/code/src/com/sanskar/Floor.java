// What is "Floor"?
/*
In a sorted array, the floor of a number is:

“The largest number in the array that is less than or equal to the target.”
If no such number exists (i.e., the target is smaller than the smallest number), return an indicator like -1 or just let it return end as in your logic.
*/
/*
Array: {2, 3, 5, 9, 14, 16, 18}
Target: 15
Floor: 14 (greatest number ≤ 15)
 */

// Package declaration
package com.sanskar;
/*
This defines the package the class belongs to. Useful for code organization.
 */

// Main method
public class Floor {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);

        System.out.println(ans);

    }
    /*
     arr is a sorted array.
     target is the number whose floor we want.
     The result (ans) stores the index of the floor of target.
     The result is printed.
     */


// Floor Function
    static int floor(int[] arr, int target){
        /*
        This method returns the index of the largest number ≤ target.
         */

        int start = 0;
        int end = arr.length - 1;
        /*
        Initializes pointers for binary search.
         */

        while (start <= end) {


           // Mid-point Calculation
            int mid = start + (end - start) / 2; // new formula.
            /*
             This avoids integer overflow that can occur with (start + end) / 2.
             */

            // Comparison Logic
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid] ) {
                start = mid + 1;
            } else {

                return mid;
            }
            /*
            Cases:

              Case 1: target < arr[mid]
                   We must search in the left half, so move end to mid - 1.
              Case 2: target > arr[mid]
                   The mid value is a candidate, but maybe there’s a bigger one ≤ target, so we move start = mid + 1.
              Case 3: target == arr[mid]
                   We found the exact match, so return mid.
             */

        }

        // Final Return
        return end;
        /*
        Why return end?

          After the loop, if no exact match was found:
             end will point to the largest number smaller than or equal to the target.
             So it represents the floor index.
         */

    }
}
//Example Dry Run;
/*
arr = {2, 3, 5, 9, 14, 16, 18}, target = 15

Steps:

start = 0, end = 6
mid = 3 → arr[3] = 9 → 15 > 9 → start = 4
mid = 5 → arr[5] = 16 → 15 < 16 → end = 4
mid = 4 → arr[4] = 14 → 15 > 14 → start = 5
Now: start = 5, end = 4 → loop ends
Return end = 4 → arr[4] = 14

✅ Floor of 15 is 14 (index 4)

Output: 4
// Meaning: floor of 15 is at index 4 in the array (arr[4] = 14)

// Summary of Logic
| Step                         | Logic                                                            |
| ---------------------------- | ---------------------------------------------------------------- |
| Initialize `start` and `end` | Binary search window                                             |
| Loop until `start <= end`    | Standard binary search                                           |
| If `target < arr[mid]`       | Search left (`end = mid - 1`)                                    |
| If `target > arr[mid]`       | Search right (`start = mid + 1`)                                 |
| If `target == arr[mid]`      | Exact match, return `mid`                                        |
| After loop ends              | `end` will be at the greatest number ≤ target → return `end`     |


 */
