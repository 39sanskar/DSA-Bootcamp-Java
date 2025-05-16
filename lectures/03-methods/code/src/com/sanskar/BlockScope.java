package com.sanskar;

public class BlockScope {
    public static void main(String[] args) {
        int a = 10; // declaring
        int b = 20;

        String name = "Sanskar";

        {
//          int  a = 10; // already declare  outside the block in the same method, hence you cannot declare again. but you can change the value definitely.

            a = 100; // (updating) reassign the original reference variable to some other value
            System.out.println(a); // 100


            int c = 99;

            name = "Aman";
            System.out.println(name); // Aman
            // value initialised in this block, will remain in block
        }
//        System.out.println(c); // cannot use outside the block

        // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);
//        System.out.println(i); // cannot use outside the block

        System.out.println(a);  // 10000
        System.out.println(name); // Aman
    }
}

// Anything that define outside you can use inside but anything define inside you can not use outside .
