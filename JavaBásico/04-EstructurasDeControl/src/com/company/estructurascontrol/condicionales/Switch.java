package com.company.estructurascontrol.condicionales;

public class Switch {

    public static void main(String[] args) {
        String day = "Friday";

        switch (day) {
            case "Lunes":
                System.out.println("Today is Monday. Cheer up!");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday. Cheer up!");
                break;
            case "Wednesday":
                System.out.println("Today is Tuesday. Cheer up!");
                break;
            case "Thursday":
                System.out.println("Today is Thursday. Cheer up!");
                break;
            case "Friday":
                System.out.println("Today is Friday. Cheer up!");
                break;
            case "Saturday":
                System.out.println("Today is Saturday. Cheer up!");
                break;
            case "Sunday":
                System.out.println("Today is Sunday. Cheer up!");
                break;
            default:
                System.out.println("Not a valid day.");
                break;
        }
    }
}
