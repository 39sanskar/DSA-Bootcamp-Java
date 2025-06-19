/*
448. Find All Number Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]


Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n


Follow up: Could you do it without extra space and in O(n) runtime? You may assume
the returned list does not count as extra space.

*/
// Asked in Google
package com.sanskar;

import java.util.List;
import java.util.ArrayList;
public class FindAllMissing {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        // cyclic‑sort each value into its “correct” slot (value‑1)
        while (i < nums.length) {
            int correct = nums[i] - 1;     // where this value belongs

            if (nums[i] != nums[correct]){ // swap it into place
                swap(nums, i , correct);
            } else {
                i++;          // already in place -> move on
            }
        }
        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1) {// value missing here
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
