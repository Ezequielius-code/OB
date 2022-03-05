package com.company;

public class Sobrecargas {

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;
        int num3 = 12;
        float num4 = 53.54f;
        float num5 = 476.123f;

        int intResult = addition(num1, num2);
        System.out.println(intResult);

        intResult = addition(num1, num2, num3);
        System.out.println(intResult);

        float floatResult = addition(num4, num5);
        System.out.println(floatResult);
    }

    static int addition(int operand1, int operand2) {
        return operand1 + operand2;
    }

    static float addition(float operand1, float operand2) {
        return operand1 + operand2;
    }

    static int addition(int operand1, int operand2, int operand3) {
        return operand1 + operand2 + operand3;
    }
}
