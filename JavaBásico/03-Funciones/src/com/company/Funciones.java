package com.company;

public class Funciones {

    public static void main(String[] args) {
        //Tipo 1: función sin parámetros y sin tipo de retorno.
        displayMenu();
        displayMenu();

        //Tipo 2: función sin parámetros y con tipo de retorno.
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        //Tipo 3: función con parámetros y sin tipo de retorno.
        printGreeting("Alfred");

        //Tipo 4: función con parámetros y con tipo de retorno.
        String name = "Johnson";
        String greeting = getGreeting(name, "Smith");
        System.out.println(greeting);

        //Otro ejemplo:
        int result = addition(50, 200);
        System.out.println(result);
    }

    static void displayMenu() {
        System.out.println("Bienvenidos al E-commerce de zapatillas:");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir\n");
    }

    static String getMenu() {
        return "#get_menu----------------------------------------------------\n" +
                "Bienvenidos al E-commerce de zapatillas:\n1 - Ver zapatillas\n" +
                "2 - Comprar zapatillas\n3 - Salir\n";
    }

    static void printGreeting(String name) {
        System.out.println("Good afternoon " + name + "!\n");
    }

    static String getGreeting(String name, String surname) {
        return "Good Afternoon " + name + " " + surname + "!\n";
    }

    static int addition(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
