package com.sanskar;

public class CountNums {
    public static void main(String[] args) {
        int n = 45536;

        int count = 0;
        while ( n > 0) {
            int rem = n % 10; // it gives the last digit of the given number.
            if ( rem == 5) {
                count++;
            }
            n = n / 10; // n /= 10
        }
        System.out.println(count);
    }
}

/*
in the above code it will count the particular digit which is how many times appear in the given number.

 */