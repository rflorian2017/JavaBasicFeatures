package javabasic6.vehicles;

abstract public class Vehicle {
    private int numarRoti;
    private int numarLocuri;
    private int capacitateCilindrica;

    public Vehicle(int numarRoti, int numarLocuri, int capacitateCilindrica) {
        this.numarRoti = numarRoti;
        this.numarLocuri = numarLocuri;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public int getNumarRoti() {
        return numarRoti;
    }

    public void setNumarRoti(int numarRoti) {
        this.numarRoti = numarRoti;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public int getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public void setCapacitateCilindrica(int capacitateCilindrica) {
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public String displayVehicleInfo() {
        String content= "I am a vehicle!";

        return content;
    }

    @Override
    public String toString() {
        String content= "I am a vehicle!";

        return content;
    }
}
