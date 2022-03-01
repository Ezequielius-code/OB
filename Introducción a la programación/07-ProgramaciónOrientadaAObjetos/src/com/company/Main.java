package com.company;

public class Main {

    public static void main(String[] args) {
        Car firstCar = new Car();

        System.out.println(firstCar.currentSpeed);
        firstCar.speedUp();
        System.out.println(firstCar.currentSpeed);
        firstCar.brake();

        Car secondCar = new Car();
        Car thirdCar = new Car(2, 90);

        System.out.printf("Doors: %d\n", secondCar.numberOfDoors);
        System.out.printf("Max Speed: %d\n", secondCar.maxSpeed);
        System.out.println(secondCar.currentSpeed);

        System.out.printf("Doors: %d\n", thirdCar.numberOfDoors);
        System.out.printf("Max Speed: %d\n", thirdCar.maxSpeed);
    }
}
 class Car {
    int numberOfDoors;
    int maxSpeed;
    float currentSpeed;

    public Car() {
        numberOfDoors = 5;
        maxSpeed = 120;
    }

    public Car(int numberOfDoors, int maxSpeed) {
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
    }

    public void speedUp() {
        currentSpeed += 15;
    }
    public void brake() {}
 }