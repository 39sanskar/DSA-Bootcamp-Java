package com.sanskar;
// 410.Split Array Largest Sum
/*
Given an integer array nums and an integer k,
split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
Return the minimized largest sum of the split.
A subarray is a contiguous part of the array.
Example 1:
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:
Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 10^6
1 <= k <= min(50, nums.length)
 */
/*
public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;


        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this subarray, make new one
                    // say you add this in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {     // in notes  k is replace with m
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // here start == end
    }
}
*/


// This is including input also

public class SplitArray {
    public static void main(String[] args) {
        // Example test case
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        SplitArray solution = new SplitArray();
        int result = solution.splitArray(nums, k);

        System.out.println("Minimum largest subarray sum: " + result); // Expected: 18
    }

    public int splitArray(int[] nums, int k) {
        // Edge case handling
        if (nums == null || nums.length == 0 || k <= 0) {
            return 0;
        }

        int start = 0;
        int end = 0;

        // Set search boundaries: start = max element, end = total sum
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // Binary search to find the minimal largest subarray sum
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Try to split using mid as the max allowed sum per subarray
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // Start a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                // Too many subarrays — need to increase allowed max sum
                start = mid + 1;
            } else {
                // Can split into k or fewer — try to lower max sum
                end = mid;
            }
        }

        // start == end → minimal possible largest subarray sum
        return end;
    }
}

