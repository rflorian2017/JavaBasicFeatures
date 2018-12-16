package javabasic6.vehicles.cars;

import javabasic6.vehicles.Vehicle;

public abstract class Car extends Vehicle {
    private String carMaker;

    public Car(int numarRoti, int numarLocuri, int capacitateCilindrica, String carMaker) {
        super(numarRoti, numarLocuri, capacitateCilindrica);
        this.carMaker = carMaker;
    }

    public String getCarMaker() {
        return carMaker;
    }
}
