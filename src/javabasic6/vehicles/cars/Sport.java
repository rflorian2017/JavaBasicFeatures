package javabasic6.vehicles.cars;

public class Sport extends Car {
    private boolean hasSportMode;

    public Sport(int numarRoti, int numarLocuri, int capacitateCilindrica,
                 String carMaker, boolean hasSportMode) {
        super(numarRoti, numarLocuri, capacitateCilindrica, carMaker);
        this.hasSportMode = hasSportMode;
    }

    public boolean hasSportMode() {
        return hasSportMode;
    }

}
