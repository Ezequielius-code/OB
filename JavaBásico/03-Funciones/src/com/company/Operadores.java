package com.company;

public class Operadores {

    public static void main(String[] args) {

        //Arithmetics
        int num1 = 10;
        int num2 = 20;

        int additionResult = num1 + num2;
        System.out.println(additionResult);

        int subtractionResult = num1 - num2;
        System.out.println(subtractionResult);

        /*
        Compare operators
            > mayor que
            < menor que
            >= mayor igual que
            <= menor igual que
            == igual que
         */

        boolean isGreaterThan = num1 > num2;
        System.out.println(isGreaterThan);

        boolean isLessThan = num1 < num2;
        System.out.println(isLessThan);

        /*
        Logic operators
            && and
            || or
         */

        boolean isInRange = num1 > 5 && num1 < 30;
        System.out.println(isInRange);
    }
}
