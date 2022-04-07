package com.excepciones;

import java.io.IOException;

public class GenerarExcepciones {

    public static void main(String[] args) {
        try {
            divide(4, 0);
        } catch (Exception e) {
            System.out.println("IOException thrown");
        }
    }

    public static int divide(int A, int B) throws ArithmeticException, IOException {
        int result;
        try {
            result = A / B;
        } catch (ArithmeticException e) {
            throw new IOException();
        }
        return result;
    }
}
