package com.company.estructurascontrol.repetitivas;

public class While {

    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            count++;
            if (count == 5) {
                continue;
            } else if (count > 6 && count % 2 == 0) {
                break;
            }
            System.out.println("Count: " + count);
        }
    }
}
