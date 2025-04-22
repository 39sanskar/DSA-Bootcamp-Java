package com.sanskar;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        /*
         in.next().trim() => basically it is a string  .charAt(0) => it print character at this index of string.
         here index is 0
         */

    //    System.out.println(in.next()); // it will print the next word.
        /*
        .trim() function is remove the extra space.
         */

    //    System.out.println(in.next().trim());  // it will kill the extra space. that end of these words

        String word = "hello";
        System.out.println(word.charAt(0));
        System.out.println(ch); // ch is define in Scanner

    }
}

