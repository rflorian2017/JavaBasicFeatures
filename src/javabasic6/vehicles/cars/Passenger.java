package javabasic6.vehicles.cars;

public class Passenger extends Car {
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
}
