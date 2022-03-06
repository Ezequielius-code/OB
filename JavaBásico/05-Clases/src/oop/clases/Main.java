package oop.clases;

import oop.herencia.Car;
import oop.herencia.Motorbike;
import oop.herencia.Truck;

public class Main {

    public static void main(String[] args) {
        //1. Clases y objetos
        //Crear un objeto utilizando el constructor vacío.
        Vehicle firstVehicle = new Vehicle();

        //Crear un objeto utilizando el constructor con parámetros.
        Motor secondVehicleMotor = new Motor("GTI", 190, 459.0, 6);
        Vehicle secondVehicle = new Vehicle("Ford", "Mondeo", 2.1, 2010, false, 0, secondVehicleMotor);
        System.out.println(secondVehicle.manufacturer);
        System.out.println(secondVehicle.year);
        System.out.println(secondVehicle.speed);
        secondVehicle.speedUp(50);
        System.out.println(secondVehicle.speed);

        //2. Herencia
        Motorbike firstMotorbike = new Motorbike();
        firstMotorbike.manufacturer = "Kawasaki";
        firstMotorbike.model = "Ninja";

        //3. Polimorfismo
        Vehicle oneVehicle;

        oneVehicle = new Motorbike();
        oneVehicle.speedUp(70);

        oneVehicle = new Car();
        oneVehicle.speedUp(40);

        oneVehicle = new Truck();
        oneVehicle.speedUp(15);

        //4. Clases abstractas. No se pueden instanciar, solo las clases derivadas generan instancias.
    }
}
