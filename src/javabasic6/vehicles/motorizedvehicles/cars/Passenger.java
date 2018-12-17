package javabasic6.vehicles.motorizedvehicles.cars;

import javabasic6.vehicles.ElectricalMotorized;

public class Passenger extends Car implements ElectricalMotorized {
    public Passenger(int numarRoti, int numarLocuri, int capacitateCilindrica, String carMaker) {
        super(numarRoti, numarLocuri, capacitateCilindrica, carMaker);
    }

    @Override
    public String displayVehicleInfo() {
        return "I am a " +
                this.getCarMaker()
                + " passenger car!\n";
    }

    @Override
    public String toString() {
        return "I am a " +
                this.getCarMaker()
                + " passenger car!\n";
    }

    @Override
    public void convertToElectrical(int chargeTime) {
        this.setCarMaker(this.getCarMaker()
                + " electrical with charging time: "
                + chargeTime + " hours");
    }
}
