package com.company;

public class Main {

    public static void main(String[] args) {

        //Bucle for
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        //Bucle while
        int count = 0;

        while (count < 10) {
            System.out.println("Printing while");
            count++;
        }

        //continue & break
        int count2 = 0;

        while (count2 < 10) {
            count2++;
            if (count2 == 6){
                continue;
            }
            else if (count2 == 8) {
                break;
            }
            System.out.println(count2 + " continue&break");
        }
    }
}
