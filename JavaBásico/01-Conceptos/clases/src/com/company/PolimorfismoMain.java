package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {
        //Car firstCar = new Car();
        Car secondCar = new ElectricCar();
        Car thirdCar = new HybridCar();

        if (secondCar instanceof ElectricCar) {
            System.out.println("Electric Car");
        }

        if (thirdCar instanceof ElectricCar) {
            System.out.println("Electric Car");
        }
        else {
            System.out.println("This is a wrong instance");
        }
    }
}
