package com.company.Interfaces;

import com.company.Car;

public class InterfacesMain {

    public static void main(String[] args) {
        CarService service1 = new ClassicCarServiceImpl();
        CarService service2 = new SportCarServiceImpl();

        Car firstCar = service1.createDemoCar();
        Car secondCar = service2.createDemoCar();

        System.out.println(firstCar);
        System.out.println(secondCar);

        service1.destroyCar(firstCar);
        service2.destroyCar(secondCar);
    }
}
