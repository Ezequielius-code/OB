package com.company;

public class Main {

    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;

        if (number1 < number2 && number2 < number3) {
            System.out.println("True");
        }
        else if (number3 < number4) {
            System.out.println("else if");
        }
        else {
            System.out.println("False");
        }
    }
}
