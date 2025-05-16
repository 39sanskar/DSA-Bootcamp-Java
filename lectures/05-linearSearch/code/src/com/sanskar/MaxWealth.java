package com.sanskar;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {9, 1, 6},
                {3, 3, 7}
        };

        System.out.println(maximumWealth(nums));  // call the static method
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}


