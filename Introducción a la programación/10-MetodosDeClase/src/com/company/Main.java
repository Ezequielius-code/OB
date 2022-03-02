package com.company;

public class Main {

    public static void main(String[] args) {
        //Paso por valor
        int operandA = 43;
        int operandB = 13;

        System.out.println(addition(operandA,operandB));

        System.out.println(operandA);
        System.out.println(operandB);

        //Paso por referencia
        //Cuando el parámetro de una función es un objeto, estamos pasando una referencia.
        Car referenceCar = new Car();
        carChanger(referenceCar);
        System.out.println(referenceCar.speed);
        carChanger(referenceCar);
        System.out.println(referenceCar.speed);

        //Función recursiva
        int factorialResult = factorial(3);
        System.out.println(factorialResult);

        factorialResult = nonRecursiveFactorial(5);
        System.out.println(factorialResult);

        Car firstCar = new Car();
        firstCar.SpeedUp(50);

        int result = addition(2, 5);
        System.out.println(result);

        Car secondCar = new Car();
        ExecuteSpeedUp(secondCar);

        Motorbike firstMotorbike = new Motorbike();
        ExecuteSpeedUp(firstMotorbike);
    }

    public static int factorial(int number) {
        int result;

        if (number == 1) {
            return 1;
        }
        result = factorial(number -1) * number;
        return result;
    }

    public static int nonRecursiveFactorial(int number) {
        int temp;
        int result = 1;

        for (temp = 1; temp <= number; temp++) {
            result = result * temp;
        }
        return result;
    }

    public static int addition(int operandA, int operandB) {
        return operandA + operandB;
    }

    public static void ExecuteSpeedUp(Vehicle vehicle) {
        vehicle.SpeedUp(15);
    }

    public static void carChanger(Car car) {
        car.speed += 50;
    }
}

interface Vehicle {
    void SpeedUp(int howMuchSpeed);
    void Brake(int howMuchSpeed);
}

class Car implements Vehicle {
    int speed = 0;

    public void SpeedUp(int howMuchSpeed) {
        System.out.println("Car() -> SpeedUp()");
    }

    public void Brake(int howMuchSpeed) {
        System.out.println("Car() -> Brake()");
    }
}

class Motorbike implements Vehicle {

    public void SpeedUp(int howMuchSpeed) {
        System.out.println("Motorbike() -> SpeedUp()");
    }

    public void Brake(int howMuchSpeed) {
        System.out.println("Motorbike() -> Brake()");
    }
}