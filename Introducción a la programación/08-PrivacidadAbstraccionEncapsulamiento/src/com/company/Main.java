package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setType("Coupé");
        car.setMaxSpeed(120);
        car.setRunning(true);

        Vehicle motorbike = new Vehicle();
        motorbike.setType("Scooter");
        motorbike.setMaxSpeed(50);
        motorbike.setRunning(false);

        System.out.println(car.getType() + " " + car.getMaxSpeed() + " " + car.isRunning());
        System.out.println(motorbike.getType() + " " + motorbike.getMaxSpeed() + " " + motorbike.isRunning());
    }
}

class Vehicle {
    private String type;
    private int maxSpeed;
    private boolean running;

    public void setType (String type) {
        this.type = type;
    }

    public String getType () {
        return this.type;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isRunning() {
        return running;
    }
}