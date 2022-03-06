package com.company.estructurascontrol.repetitivas;

public class ForEach {

    public static void main(String[] args) {
        String names[] = {"Pepe", "Juanito", "Ruperta"};

        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = {5, 10, 15};
        int addition = 0;
        for (int number : numbers) {
            addition += number;
        }
        System.out.println(addition);
    }
}
