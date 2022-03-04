package com.company.Interfaces;

import com.company.Car;
import com.company.HybridCar;
import com.company.Interfaces.CarService;

public class SportCarServiceImpl implements CarService {
    @Override
    public Car createDemoCar() {
        return new HybridCar();
    }

    @Override
    public void destroyCar(Car car) {
        System.out.println("Coche destruido");
    }
}
