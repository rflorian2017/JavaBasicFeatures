package javabasic6.vehicles;

abstract public class Vehicle {
    private int numarRoti;
    private int numarLocuri;

    public Vehicle(int numarRoti, int numarLocuri) {
        this.numarRoti = numarRoti;
        this.numarLocuri = numarLocuri;
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
