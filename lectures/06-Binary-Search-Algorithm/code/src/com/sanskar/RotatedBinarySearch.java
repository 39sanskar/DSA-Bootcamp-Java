package com.sanskar;

// 33.Search in Rotated Sorted Array
/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1


Constraints:

1 <= nums.length <= 5000
-10^4 <= nums[i] <= 10^4
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-10^4 <= target <= 10^4
 */

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(findPivot(arr));
        System.out.println(search(arr, target));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search because array is not rotated

            return binarySearch(nums, target, 0, nums.length -1);
        }

        // if pivot is found, you have found 2 ascending sorted arrays
        // Case -1
        if(nums[pivot] == target) {
            return pivot;
        }
        // Case -2
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot -1);
        }
        // Case -3
        return binarySearch(nums, target, pivot + 1, nums.length -1);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Important steps
    // this will not work in duplicate value.
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            // Case-1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case -2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot ?
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                    /*
                     when start will be pivot when the next element is smaller than start.
                     */
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                    /*
                     when end going to be pivot when the previous element is greater than the end
                     */
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            // 4 cases over here
            // Case-1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case -2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Case -3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                /*
                   (arr[start] < arr[mid]) this means it is a sorted array. may be possible more bigger number will lie ahead of it.
                   because if this middle that i am talking about  (start < middle) . the middle point over here if this was the pivot
                   it will caught the above code cases.
                   definitely because of this more bigger no. exist after the middle so i can search in the second part of the array now.
             */
                start = mid + 1;
            }
        }
        return -1;
    }
}

// This above code is faster
