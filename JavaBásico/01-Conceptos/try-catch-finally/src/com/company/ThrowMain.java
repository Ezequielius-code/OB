package com.company;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {
        try {
            readNames();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que lee los nombres de consola y verifica que tengan
     * longitud igual o mayor a 8 caracteres.
     * @throws NameFormatException
     */
    private static void readNames() throws NameFormatException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a name: ");
        while (keyboard.hasNext()) {
            System.out.println("Enter a name: ");
            String name = keyboard.nextLine();
            if (name.length() < 8) {
                keyboard.close();
                throw new NameFormatException("The name must have at least 8 characters.");
            }
        }
    }
}
