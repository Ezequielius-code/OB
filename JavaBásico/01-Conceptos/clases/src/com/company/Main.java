package com.company;

public class Main {

    public static void main(String[] args) {
        //Dan error porque Car es una clase abstracta.
        //Las clases abstractas NO PUEDEN INSTANCIAR.
        /*Car firstCar = new Car();
        Car secondCar = new Car("Red", "Honda", "Civic",1430.45,5.4);

        secondCar.SpeedUp(70);
        secondCar.weight = 1350.8;

        System.out.println(secondCar);*/

        ElectricCar firstElectricCar = new ElectricCar();

        firstElectricCar.electricMotor = "Example";
        firstElectricCar.color = "Gray";
        firstElectricCar.manufacturer = "Tesla";
        firstElectricCar.model = "T-1000";

        System.out.println(firstElectricCar);

        ElectricCar secondElectricCar = new ElectricCar("Blue", "Tata", "2000DT", 658.23, 4.21, "TataElec2022");

        System.out.println(secondElectricCar);

        secondElectricCar.SpeedUp(38);

        System.out.println(secondElectricCar);
    }
}
