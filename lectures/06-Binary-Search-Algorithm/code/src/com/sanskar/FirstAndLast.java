package com.sanskar;
/*
// 34.Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


 */

public class FirstAndLast {
    public static void main(String[] args) {
        // Hardcoded input values
        int[] nums = {5, 7, 7, 8, 8, 10}; // the array input
        int target = 8;                   // the target value

        // Create an object of the class to call  searchRange() method (because it's non-static)
        FirstAndLast obj = new FirstAndLast();

        // Call the method and store the result
        int[] result = obj.searchRange(nums, target);
        /*
           You call the method searchRange() and pass in nums and target.
           It returns an array with 2 values: first and last index of the target.
         */


        // Print the output
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        /*
           Prints the result in array format.
           If target is not found, it will print [-1, -1].

         */
    }

    public int[] searchRange(int[] nums, int target) {
        /*
          This method finds the range (start and end index) of the target.
         */

        int[] ans = {-1, -1};
        /*
          Default result: if the target is not found.
         */

        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        /*
           You call a binary search helper function twice:
           First time with true → search left (first occurrence).
           Second time with false → search right (last occurrence).

         */
        return ans;
    }


    // this function just returns the index value of target.
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;                  // default: target not found
        int start = 0;                 // beginning of array
        int end = nums.length - 1;     // end of array

        while (start <= end) {

            int mid = start + (end - start) / 2;     // middle index (Prevent overflow)

            if (target < nums[mid]) {
                end = mid - 1;                    // search left half
            } else if (target > nums[mid]) {
                start = mid + 1;                  // search right half
            } else {
                // potential ans found
                // target found at mid
                ans = mid;     //  store current index as potential answer
                if (findStartIndex) {
                    /*
                    findStartIndex itself value of true or false  it is a boolean expression.
                     */
                    // looking for first occurrence ---> search left
                    end = mid - 1; // keep searching left
                } else {
                    // looking for first occurrence ---> search right
                    start = mid + 1; // keep searching right
                }
            }
        }
        return ans;
    }
}

//Summary
    /*

    searchRange() calls binary search twice to find the first and last position of the target.
    search() is a modified binary search that behaves differently based on findStartIndex.

     */



/*
// Logic Breakdown
1.searchRange(nums, target)
Calls the helper method search() twice:
First with findStartIndex = true → finds first position of target.
Then with findStartIndex = false → finds last position of target.
Returns an array [firstIndex, lastIndex].


2. search(nums, target, findStartIndex)
This is a modified binary search.

What changes based on findStartIndex?

If findStartIndex == true: keep searching left after finding target (to find first index).
If false: keep searching right after finding target (to find last index).
Why does it return -1 by default?

If target doesn't exist in the array at all, ans is unchanged (-1), which means “not found.”


// Dry Run
nums = {5, 7, 7, 8, 8, 10}
target = 8

Step 1: First Search — search(nums, 8, true)
Goal: Find first occurrence (leftmost) of 8

start = 0, end = 5
mid = (0 + 5) / 2 = 2 → nums[2] = 7
→ 8 > 7 → move start to mid + 1 = 3
mid = (3 + 5) / 2 = 4 → nums[4] = 8
→ match! ans = 4, but keep searching left → end = mid - 1 = 3
mid = (3 + 3) / 2 = 3 → nums[3] = 8
→ match! ans = 3, keep searching left → end = 2
Loop exits.
✅ First index = 3


Step 2: Second Search — search(nums, 8, false)
Goal: Find last occurrence (rightmost) of 8

start = 0, end = 5
mid = 2 → nums[2] = 7
→ 8 > 7 → move start = 3
mid = 4 → nums[4] = 8
→ match! ans = 4, search right → start = 5
mid = 5 → nums[5] = 10
→ 8 < 10 → move end = 4
Loop exits.
✅ Last index = 4

// Final Result
Output: [3, 4]


// Time & Space Complexity
| Aspect           | Value      |
| ---------------- | ---------- |
| Time Complexity  | `O(log n)` |
| Space Complexity | `O(1)`     |

Binary search is applied twice, but each is still O(log n), so overall time is still O(log n).

// Summary

Binary search is used to find both the first and last positions of the target.
You slightly modify the search direction using the findStartIndex flag.
If target is not found, returns [-1, -1].



 */

