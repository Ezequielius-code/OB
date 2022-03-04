package com.company;

import java.sql.Struct;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        int[] numbers = new int[] { 5, 4, 3, 2, 1, 0 };

        names[0] = "firstName";
        names[1] = "secondName";
        names[2] = "thirdName";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println(numbers.length);
    }
}
