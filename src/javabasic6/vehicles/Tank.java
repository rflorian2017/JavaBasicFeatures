package javabasic6.vehicles;

import javabasic6.vehicles.motorizedvehicles.MotorizedVehicle;

public class Tank extends MotorizedVehicle {
    private int shootingRange;

    public Tank(int numarRoti, int numarLocuri, int capacitateCilindrica) {
        super(numarRoti, numarLocuri, capacitateCilindrica);
    }

    public int getShootingRange() {
        return shootingRange;
    }

    public void setShootingRange(int shootingRange) {
        this.shootingRange = shootingRange;
    }
}
