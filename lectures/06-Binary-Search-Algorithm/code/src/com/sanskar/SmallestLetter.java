package com.sanskar;
/*
// 744.Find Smallest Letter Greater than Target
You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.
 */
public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'}; // Case 1
        char target = 'a';
        char[] letters1 = {'c', 'f', 'j'}; // Case 2
        char target1 = 'c';
        char[] letters2 = {'x', 'x' ,'y','y'}; // Case 3
        char target2 = 'z';
        System.out.println(nextGreatestLetter(letters, target));
        System.out.println(nextGreatestLetter(letters1, target1));
        System.out.println(nextGreatestLetter(letters2, target2));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}

