package com.company;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car();
        car.maxSpeed = 220;
        car.plate = "ABC 1234 ES";
        car.setSound("BRRR");

        System.out.println(car.getSound());

        Motorbike motorbike = new Motorbike();
        motorbike.maxSpeed = 160;
        motorbike.plate = "GHJ 0246 FR";
        motorbike.setSound("PRRR");

        System.out.println(motorbike.getSound());

        ElectricCar electricCar = new ElectricCar();
        electricCar.maxSpeed = 180;
        electricCar.plate = "XYZ 9876 IT";

        System.out.println(electricCar.checkPlate(electricCar.plate));
    }
}

abstract class Vehicle {
    int maxSpeed;
    String plate;
    String sound;

    abstract public void setSound(String sound);

    abstract public String getSound();

    public boolean checkPlate(String plate) {
        if (plate == "XXX XXXX XX") {
            return true;
        }
        return false;
    }
}

class Car extends Vehicle {
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }
}

class Motorbike extends Vehicle {
    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }
}

//Una final class, es una clase que no permite herencia.
final class ElectricCar extends Car {}