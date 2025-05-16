package com.sanskar;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Calling the random function and passing a value for marks
        random(a);  // You can also pass any int like random(95);

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num); // <-- First Output
        System.out.println(marks); // <-- Second Output

        // scope => it means you can access those variable only inside the function.
    }

}
