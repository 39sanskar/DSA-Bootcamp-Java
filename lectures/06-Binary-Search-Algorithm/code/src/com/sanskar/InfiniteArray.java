package com.sanskar;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
        100, 130, 140, 160, 170};

        int target = 10;
        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1;           // (this is my new start) ---> Important 
            // double the box value
            // end = previous end + (sizeofbox)*2
            end = end + (end - start + 1) * 2;
            /*
            here (end - start + 1) it is the size of the box
             */
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end) {
            // find the middle element
//      int mid = (start + end) / 2;
            /*
            might be possible that (start + end) exceeds the range of integer in java.
            */
           /*
            problem is integer has a fix size after some amount of value you cannot input
            value of integer

           */
            int mid = start + (end - start) / 2; // new formula.

            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid] ) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;  // This is only be executed when nothing has return so now.
    }
}



