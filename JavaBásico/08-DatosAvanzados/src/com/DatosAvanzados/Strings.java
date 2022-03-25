package com.DatosAvanzados;

public class Strings {

    public static void main(String[] args) {
        // Cadenas de texto.
        String text = "Text message";

        int textLength = text.length();
        System.out.println("The length of my string is: " + textLength + " characters.");

        String capitalText = text.toUpperCase();
        System.out.println("\nWith capital letters, the string is: " + capitalText + ".");

        String lowerCaseText = text.toLowerCase();
        System.out.println("\nNow in lower case: " + lowerCaseText + ".");

        boolean result = text.startsWith("tex");
        if (result) {
            System.out.println("\nThe string starts with what I´m looking for.");
        }
        else {
            System.out.println("\nDoesn´t start with what I want.");
        }

        result = text.endsWith("sage");
        if (result) {
            System.out.println("\nThe string ends with what I´m looking for.");
        }
        else {
            System.out.println("\nDoesn´t end with what I want.");
        }

        char letter = text.charAt(0);
        System.out.println("\nThe character at the index 0 is: " + letter);

        for (int i = 0; i < textLength; i++) {
            System.out.println("Current character: " + text.charAt(i));
        }
    }
}
