package com.company;

public class Main {

    public static void main(String[] args) {
        helloWorld();
        helloWorld();

        helloWorld("Jorge");
        helloWorld("Oscar");

        String hello = returnHelloWorld();
        System.out.println(hello);
    }

    private static void helloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    private static void helloWorld(String name) {
        System.out.println("Hello " + name);
    }

    private static String returnHelloWorld() {
        return "Hello World!!!";
    }
}
