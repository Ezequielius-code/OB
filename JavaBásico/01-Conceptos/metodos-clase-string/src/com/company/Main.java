package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        /*
            length()
            startsWith("")
            endsWith("")
            indexOf("")
            subString(1,5)
            trim()
            equals()
            compareTo
         */

        String message = "   Hello World   ";
        System.out.println(message.length());

        String capitalMessage = message.toUpperCase();
        System.out.println(capitalMessage);

        System.out.println(capitalMessage.trim());

        String otherMessage = "Hello world";

        if (capitalMessage.equals(otherMessage)) {
            System.out.println("Are equals!!!");
        }

        capitalMessage = capitalMessage.trim();

        if (capitalMessage.equalsIgnoreCase(otherMessage)) {
            System.out.println("Are really equals!!!");
        }
    }
}
