package javabasic6.vehicles.motorizedvehicles;

import javabasic6.vehicles.Vehicle;

abstract public class MotorizedVehicle extends Vehicle {
    private int capacitateCilindrica;

    public MotorizedVehicle(int numarRoti, int numarLocuri, int capacitateCilindrica) {
        super(numarRoti, numarLocuri);
        this.capacitateCilindrica = capacitateCilindrica;
    }



    public int getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(int capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    @Override
    public String toString() {
        return "I am motorized vehicle!";
    }
}
