package com.DatosAvanzados;

public class Arrays {

    public static void main(String[] args) {
        int firstArray[] = new int[5];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;

        for (int i : firstArray) {
            System.out.printf(i + ", ");
        }
        System.out.println("");

        int secondArray[] = {10, 20, 30, 40, 50};

        for (int i : secondArray) {
            System.out.printf(i + ", ");
        }
        System.out.println("");

        String names[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        for (String i : names) {
            System.out.printf(i + ", ");
        }
        System.out.println("\nNames array length: " + names.length + "\n");

        for (String name : names) {
            System.out.println("Current name: " + name);
        }

        String lastListedName = "";
        for (int i = 0; i < names.length; i++) {
            System.out.println("Current name: " + names[i] + " Position: " + i);
            lastListedName = names[i];
        }

        System.out.println("Last name: " + lastListedName);

        int thirdArray[][] = new int[2][4];
        thirdArray[0][0] = 1;
        thirdArray[0][1] = 2;
        thirdArray[0][2] = 3;
        thirdArray[0][3] = 4;
        thirdArray[1][0] = 10;
        thirdArray[1][1] = 20;
        thirdArray[1][2] = 30;
        thirdArray[1][3] = 40;

        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = 0; j < thirdArray[i].length; j++) {
                System.out.println("Valor de i: " + i + " Valor de j: " + j);
                System.out.println(thirdArray[i][j]);
            }
        }

        int fourthArray[][] = {
                {5, 6, 7, 8},
                {50, 60, 70, 80}
        };
    }
}
