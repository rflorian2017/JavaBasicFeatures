package javabasic6.vehicles;

import javabasic6.vehicles.cars.Passenger;
import javabasic6.vehicles.cars.Sport;

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
        String content= "";

        if(this instanceof Passenger) {
            content += "I am a " +
                    ((Passenger) this).getCarMaker()
                    + " passenger car!\n";
        }

        else if(this instanceof Sport) {
            content += "I am a " +
                    ((Sport) this).getCarMaker()
                    + " sport car and sport mode is : " +
                    ( ((Sport)this).hasSportMode()?"activated!\n":"deactivated!\n" );
        }

        else if(this instanceof Motorcycle) {
            content += "I am a motorcycle!\n";
        }


        return content;
    }

}
