package com.company;

public abstract class Car {
    //atributos
    String color;
    String manufacturer;
    String model;
    Double weight;
    Double large;
    Integer speed = 0;

    //constructores

    public Car() {
    }

    public Car(String color, String manufacturer, String model, Double weight, Double large){
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.large = large;
    }

    //comportamiento
    public void SpeedUp(Integer speed) {
        if (speed > 0 && speed <= 120) {
            this.speed = speed;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", large=" + large +
                ", speed=" + speed +
                '}';
    }
}
