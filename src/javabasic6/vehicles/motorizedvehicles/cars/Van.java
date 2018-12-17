package javabasic6.vehicles.motorizedvehicles.cars;

public class Van extends Car {
    private int capacitateTransportMarfa;

    public Van(int numarRoti, int numarLocuri, int capacitateCilindrica, String carMaker, int capacitateTransportMarfa) {
        super(numarRoti, numarLocuri, capacitateCilindrica, carMaker);
        this.capacitateTransportMarfa = capacitateTransportMarfa;
    }
}
