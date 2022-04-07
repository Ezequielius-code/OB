package com.excepciones;

import java.util.Scanner;

public class GestionarErrores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");

        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        try {
            int result = numberA / numberB;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Boom!!! Exception: " + e.getClass());
        } catch (Exception e) {
            System.out.println("This is not an Arithmetic Exception");
        } finally {
            System.out.println("Finally");
        }
    }
}
