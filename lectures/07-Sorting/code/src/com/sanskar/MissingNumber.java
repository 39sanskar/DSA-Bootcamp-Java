/*
268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return
the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the
missing number in the range since it does not appear in nums.
Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the
missing number in the range since it does not appear in nums.
Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation:
n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing
number in the range since it does not appear in nums.

Constraints:
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.

 */
package com.sanskar;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
           /*
            if (arr[i] < arr.length && arr[i]  != arr[arr[i]]){
                // (arr[i]  != arr[arr[i]]) => it is not equal to its own index
                    swap(arr, i , arr[i]);
            } else {
                    i++; // move ahead
            }
            */

            // another way
            int correct = arr[i];
            /*
             because of that it is start from 0 if it is start from 1 then
             int correct = arr[i] - 1;
             */
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }

        }
        // case1
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
         // case2: When N is not there in array
        return arr.length; // basically it is return N
    }

    static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }

}