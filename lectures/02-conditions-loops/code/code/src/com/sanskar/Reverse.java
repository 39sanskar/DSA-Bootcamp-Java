package com.sanskar;

public class Reverse {
    public static void main(String[] args) {
        int num = 28479;

        int ans = 0; // it will store the reverse number.

        while (num > 0) {
            int rem = num % 10; // it gives the rem.
            num /= 10; // it remove the last digit od the number.

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}

// The above program is  reverse  the given number.