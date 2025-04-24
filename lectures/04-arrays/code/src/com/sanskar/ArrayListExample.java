package com.sanskar;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10); // Creating ArrayList of integer.

//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(654);
//        list.add(8765);


//        System.out.println(list.contains(765432)); // it print the particular contain element.
//        System.out.println(list);
//        list.set(0, 99);  // 0th index change to 99
//        list.remove(2); // it will remove index no. 2
//        System.out.println(list);

        // input
        for(int i = 0; i < 5; i++ ) {
            list.add(in.nextInt());
        }

        // get item at any index
        for(int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " "); // pass index here, lit[index] syntax will not work here.
        }

//        System.out.println(list);

    }
}
