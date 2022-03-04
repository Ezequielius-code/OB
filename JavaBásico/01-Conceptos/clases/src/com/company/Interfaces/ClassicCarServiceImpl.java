package com.company.Interfaces;

import com.company.Car;
import com.company.ElectricCar;
import com.company.Interfaces.CarService;

public class ClassicCarServiceImpl implements CarService {
    @Override
    public Car createDemoCar() {
        return new ElectricCar();
    }

    @Override
    public void destroyCar(Car car) {
        System.out.println("Destruyendo coche");
    }

}
