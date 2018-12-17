package javabasic6.vehicles.bikes;

import javabasic6.vehicles.motorizedvehicles.MotorizedVehicle;

public class Motorcycle extends MotorizedVehicle {
    public Motorcycle(int numarRoti, int numarLocuri, int capacitateCilindrica) {
        super(numarRoti, numarLocuri, capacitateCilindrica);
    }

    @Override
    public String displayVehicleInfo() {
        return "I am a motorcycle!\n";
    }

    @Override
    public String toString() {
        return "I am a motorcycle!\n";
    }
}
