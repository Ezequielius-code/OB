package com.company;

public class HybridCar extends Car{
    String hybridMotor;

    public HybridCar() {}

    public HybridCar(String hybridMotor) {
        this.hybridMotor = hybridMotor;
    }

    public HybridCar(String color, String manufacturer, String model, Double weight, Double large, String hybridMotor) {
        super(color,manufacturer,model,weight,large);
        this.hybridMotor = hybridMotor;
    }

    @Override
    public void SpeedUp(Integer speed) {
        Integer regulatedSpeed = speed - 10;
        super.SpeedUp(regulatedSpeed);
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", large=" + large +
                ", speed=" + speed +
                ", hybridMotor='" + hybridMotor + '\'' +
                '}';
    }
}
