package com.company;

public class ElectricCar extends Car {
    String electricMotor;

    public ElectricCar() {
    }

    public ElectricCar(String electricMotor) {
        this.electricMotor = electricMotor;
    }

    public ElectricCar(String color, String manufacturer, String model, Double weight, Double large, String electricMotor) {
        super(color,manufacturer,model,weight,large);
        this.electricMotor = electricMotor;
    }

    @Override
    public void SpeedUp(Integer speed) {
        Integer regulatedSpeed = speed * 2;
        super.SpeedUp(regulatedSpeed);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", large=" + large +
                ", speed=" + speed +
                ", electricMotor='" + electricMotor + '\'' +
                '}';
    }
}
