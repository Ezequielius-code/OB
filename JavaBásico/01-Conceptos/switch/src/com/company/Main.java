package com.company;

public class Main {

    public static void main(String[] args) {
        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("The weather is sunny");
                break;
            case "cloudy":
                System.out.println("The weather is cloudy");
                break;
            default:
                System.out.println("Weather hasn´t been identified");
                break;
        }
    }
}
