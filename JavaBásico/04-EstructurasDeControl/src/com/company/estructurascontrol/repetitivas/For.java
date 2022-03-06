package com.company.estructurascontrol.repetitivas;

public class For {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!!!!");
        }

        String names[] = {"Pepe", "Juanito", "Ruperta"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int addition = 0;
        int[] numbers ={5, 7, 8};
        for (int i = 0; i < numbers.length; i++) {
            addition += numbers[i];
        }
        System.out.println(addition);
    }
}
