package com.company.estructurascontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {
        String day = "Tuesday";

        boolean result = day.equals("Tuesday");

        if (day.equals("Monday")) {
            System.out.println("Cheer up with the week, champions!");
        } else if (day.equals("Tuesday")) {
            System.out.println("Tuesday with 'T' of Titan.");
        } else {
            System.out.println("This day isn´t evaluated.");
        }
    }
}
