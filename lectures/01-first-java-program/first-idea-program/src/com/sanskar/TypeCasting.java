package com.sanskar;

import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
//         Destination type should be greater than the source type.

        // typecasting - compressing the bigger number into smaller type explicitly.
        //int num = (int)(67.56f);
        //System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
          /*
        here a*b = 2000 which is not be able to store in a byte because maximum value i can store is 256.
        the result of the intermediate term (a*b) is easily exceeds the range of byte operator. to handel this kind of problem java is
        automatically promating each byte to integer when its evaluating this expression thats it is able to store it

        */

        //System.out.println(d);


//        byte b = 50;
//        b = b * 2;
        /*
        it throw  an error whenever you performing expression it explicitly converting
        into integer then in a byte how can store it.
        */


        //int number = 'A';
        //System.out.println(number);// 65

        /*
        Java follow unicode principle.
        */


        System.out.println("नमस्ते"); //नमस्ते
        System.out.println("你好"); // hello in chinese - 你好

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double is the biggest entire result is converting into double;
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);


    }
}
