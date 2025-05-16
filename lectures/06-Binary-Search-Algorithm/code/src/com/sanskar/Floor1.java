// Updated Goals:
/*
Return the value of the floor, not the index.
If no floor exists (i.e., all elements are greater than target), return -1.
 */

package com.sanskar;

public class Floor1 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);

        if (ans == -1) {
            System.out.println("No floor exists.");
        } else {
            System.out.println("Floor value: " + ans);
        }
    }

    // Return the actual floor value (greatest number <= target)
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // exact match is also the floor
                return arr[mid];
            }
        }

        // At this point, end is the index of the greatest number < target
        // If end goes below 0, no floor exists
        return end >= 0 ? arr[end] : -1;
    }
}

// Summary
/*
| What changed?                   | Why?                                                           |
| --------------------------------| -------------------------------------------------------------- |
| return arr[mid]                 | To return the actual floor value when there's an exact match   |
| return end >= 0 ? arr[end] : -1 | Handles case when no floor exists (i.e., all numbers > target) |
| Added if (ans == -1) in main    | For better user-friendly output                                |

 */