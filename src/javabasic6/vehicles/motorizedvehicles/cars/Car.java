package javabasic6.vehicles.motorizedvehicles.cars;

import javabasic6.vehicles.motorizedvehicles.MotorizedVehicle;

public abstract class Car extends MotorizedVehicle {
    private String carMaker;

    public Car(int numarRoti, int numarLocuri, int capacitateCilindrica, String carMaker) {
        super(numarRoti, numarLocuri, capacitateCilindrica);
        this.carMaker = carMaker;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }
}
