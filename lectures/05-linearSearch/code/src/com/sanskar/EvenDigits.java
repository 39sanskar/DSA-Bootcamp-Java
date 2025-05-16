package com.sanskar;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        /*
        it return the how many number have even no. of digits while counting the digits.

        */

        System.out.println(digits(7896));
        System.out.println(digits2(345678));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (EvenDigits.even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not.
    static boolean even(int num){
        int numberOfDigits = digits(num); // i can call digits method
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;

         */
        return numberOfDigits % 2 == 0;

    }


    // IMPORTANT METHOD (Using this it is much faster)
    static int digits2(int num) {  // this is second method to count number of digits.

        if (num < 0) {
            num = num + 1;
        }

        return (int)(Math.log10(num)) + 1 ; // sort-cut to find number to digit.


    }

    // count number of digits in a number
    static int digits(int num){

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) { // zero contains one digit
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num = num/10; //     (num/=10)
        }
        return count;

    }
}


