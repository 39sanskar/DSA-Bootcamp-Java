package com.sanskar;

import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0; // p => previous
        int i = 1; // i => current index
        int count = 2; // we already have two numbers (p and i) our count can be start from 2

        while ( count <= n) {
            int temp = i;  // the new p is going to be  i
            i = i + p;
            p = temp;
            count ++;

        }
        System.out.println(i);

    }
}

// here n is the index of number which you want to print.