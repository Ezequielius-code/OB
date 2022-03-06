package oop.herencia;

import oop.clases.Motor;
import oop.clases.Vehicle;

public class Motorbike extends Vehicle {
    boolean trunk;

    public Motorbike() {

    }

    public Motorbike(String manufacturer, String model, double displacement, int year, boolean sport, int speed, Motor motor, boolean trunk) {
        super(manufacturer, model, displacement, year, sport, speed, motor);
        this.trunk = trunk;
    }
}
