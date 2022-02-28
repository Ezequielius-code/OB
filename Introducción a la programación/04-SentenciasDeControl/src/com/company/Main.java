package com.company;

public class Main {

    public static void main(String[] args) {
        //Sentencia if

        String season = "spring";

        if (season == "spring") {
            System.out.println("It´s spring");
        } else if (season == "summer") {
            System.out.println("It´s summer");
        } else {
            System.out.println("It´s another season");
        }

        //Sentencia while

        int count = 10;

        while (count > 0) {
            System.out.println(count);
            count = count -1;
        }

        //Sentencia do-while

        do {
            System.out.println(count);
            count = count + 1;
        } while (count <= 10);

        //Sentencia for

        for (int forCount = 1; forCount <= 10; forCount++) {
            System.out.println(forCount);
        }

        //Uso del for para recorrer un array

        int numbers[] = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Sentencia switch

        switch (season) {
            case "summer":
                System.out.println("It´s summer");
                break;
            case "winter":
                System.out.println("It´s winter");
                break;
            default:
                System.out.println("It´s " + season);
                break;
        }
    }
}
