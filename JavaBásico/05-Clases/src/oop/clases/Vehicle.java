package oop.clases;

public class Vehicle {

    //1. Atributos
    protected String manufacturer;
    protected String model;
    protected double displacement;
    protected int year;
    boolean sport;
    protected int speed;
    protected Motor motor;

    //2. Constructores
    public Vehicle() {}

    public Vehicle(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Vehicle(String manufacturer, String model, double displacement, int year, boolean sport, int speed, Motor motor) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.displacement = displacement;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    //3. Métodos (comportamiento)
    public void speedUp(int howMuchSpeed) {
        this.speed += howMuchSpeed;
    }

    //getter y setter

    //toString
}
