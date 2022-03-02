package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.sayHello();

        Adder adder = new Adder();
        adder.addition( 3, 5);
        adder.addition( (float) 5, (float) 24);
        adder.addition( 2.5, 6.8);
    }
}

class Vehicle {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

class Car extends Vehicle {
    public void sayHello() {
        System.out.println("Hello! I´m a car");
    }
}

class Adder {
    public int addition(int a, int b) {
        System.out.println("I´m the integers adder");
        return a + b;
    }

    public float addition(float a, float b) {
        System.out.println("I´m the floating point adder");
        return a + b;
    }

    public void addition(double a, double b) {
        System.out.println("The result is: " + (a + b));
    }
}