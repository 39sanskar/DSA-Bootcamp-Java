package com.sanskar;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2}; // this array is rotated 4 times ==> (pivot[index] + 1)
        System.out.println(countRotations(arr));

    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
//        if (pivot == -1) {
//            // array is not rotated
//            return 0;
//        }
        return pivot + 1;

    }
    // use this for non duplicates
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

    // use this when array contains duplicates
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
}

