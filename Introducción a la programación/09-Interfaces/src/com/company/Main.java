package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(50);

        for (; car.getSpeed() <= car.getMaxSpeed(); car.SpeedUp(15)) {
            System.out.println("The car is running at " + car.getSpeed() + "mph");
        }

        while (car.getSpeed() >= 40) {
            car.Brake(10);
            System.out.println("The car is speeding down. Current speed: " + car.getSpeed() + "mph");
        }
    }
}
 interface Vehicle {
    void SpeedUp(int howMuchSpeed);
    void Brake(int howMuchSpeed);
 }

 class Car implements Vehicle {
     private int speed = 0;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getMaxSpeed(){
        return 90;
    }

    public void SpeedUp(int howMuchSpeed) {
        this.speed += howMuchSpeed;
    }

    public void Brake(int howMuchSpeed) {
        this.speed -= howMuchSpeed;
    }
 }