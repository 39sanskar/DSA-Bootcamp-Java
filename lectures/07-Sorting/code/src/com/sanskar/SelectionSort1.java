/*
  Find the maximum element from the unsorted part of the array and place it at
   its correct index (end of the unsorted section).
 */
// Java Code - Selection Sort Using Maximum Element
package com.sanskar;
import java.util.Arrays;
public class SelectionSort1 {
    public static void main(String[] args){
        int[] arr = {2, -32, 0, 78, 1};
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }

    // Selection Sort using the maximum element
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse from the end toward the start
        for (int i = 0; i < n-1; i++){
            int last = n-i-1; // end of unsorted part
            int maxIndex = 0;

            // Find index of the maximum element in unsorted part(0 to last)
            for (int j = 1; j <= last; j++) {
                if ( arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap max element with element at last
            swap(arr, maxIndex, last);
        }

    }
    // Swap helper method
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
Output => [-32, 0, 1, 2, 78]

Time Complexity

| Case        | Description          | Time Complexity |
| ----------- | -------------------- | --------------- |
| **Best**    | Already sorted array | `O(n²)`         |
| **Average** | Random order         | `O(n²)`         |
| **Worst**   | Reverse sorted array | `O(n²)`         |

✅ Why? In all cases, Selection Sort does two nested loops:
Outer loop: runs n times
Inner loop: runs up to n, n-1, n-2, ..., 1 times
⇒ Total comparisons = n(n-1)/2 = O(n²) regardless of input.

✅ Space Complexity
O(1) (in-place sorting)
No extra space is used except a few variables for swapping.

❌ Stability
Not Stable
⚠️ A sorting algorithm is stable if it preserves the relative order of equal elements.
In Selection Sort, we often swap non-adjacent elements, which can change the original order of equal items.

{ (4,a), (3,b), (4,c), (2,d) }

If we sort by number using selection sort, (4,a) and (4,c) might be swapped, ruining their original order — not stable

| Property       | Selection Sort (max element version) |
| -------------- | ------------------------------------ |
| **Best Case**  | O(n²)                                |
| **Worst Case** | O(n²)                                |
| **Stable?**    | ❌ No                                |
| **In-place?**  | ✅ Yes (O(1) space)                  |
| **Adaptive?**  | ❌ No                                |

 */
