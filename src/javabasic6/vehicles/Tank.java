package javabasic6.vehicles;

public class Tank extends Vehicle {
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
