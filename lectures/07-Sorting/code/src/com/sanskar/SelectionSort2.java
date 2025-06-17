/*
  Find the minimum element from the unsorted part of the array and place it at
  its correct index in the sorted part.
 */

package com.sanskar;
import java.util.Arrays;
public class SelectionSort2 {
    public static void main(String[] args) {
        int[] arr = {2, -32, 0, 78, 1};
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Selection Sort function
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse the array
        for(int i =0; i< n-1; i++){
            // Assume the current i is the index of the smallest element
            int minIndex = i;

            // Find the actual minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }
    // swap function
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
Input:
[2, -32, 0, 78, 1]

Output:
Sorted Array: [-32, 0, 1, 2, 78]
Selection Sort (Minimum Element Version) - Analysis

Time Complexity
| Case        | Explanation                                      | Time Complexity |
| ----------- | ------------------------------------------------ | --------------- |
| **Best**    | Even if array is sorted, it still scans the rest | `O(n²)`         |
| **Average** | Full scanning in each loop                       | `O(n²)`         |
| **Worst**   | Reverse order (completely unsorted)              | `O(n²)`         |

❗ Selection Sort does not check if the array is already sorted — it always makes
full comparisons, so all cases are O(n²).

✅ Space Complexity
O(1) – in-place sorting (uses no extra memory except a few variables)

❌ Stability
Not stable
Even the minimum-element version is not stable because it may swap non-adjacent
equal elements, which changes their original relative order.

{ (4,a), (3,b), (4,c), (2,d) }
In selection sort, if we select (4,c) and swap it with an earlier position
 (before (4,a)), the order between (4,a) and (4,c) is lost → not stable.

✅ Summary Table
| Property            | Value                                        |
| ------------------- | -------------------------------------------- |
| **Best Case Time**  | `O(n²)`                                      |
| **Worst Case Time** | `O(n²)`                                      |
| **Space**           | `O(1)` (in-place)                            |
| **Stable?**         | ❌ No                                        |
| **Adaptive?**       | ❌ No – doesn’t take advantage of sorted data|

✅ When to Use It?
Selection Sort is simple and good for:

Small datasets
Educational purposes
Situations where memory is very limited

 */
