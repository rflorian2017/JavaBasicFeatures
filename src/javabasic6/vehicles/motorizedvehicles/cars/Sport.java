package javabasic6.vehicles.motorizedvehicles.cars;

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

    @Override
    public String displayVehicleInfo() {
        return "I am a " +
                this.getCarMaker()
                + " sport car and sport mode is : " +
                ( this.hasSportMode() ? "activated!\n" : "deactivated!\n" );
    }

    @Override
    public String toString() {
        return "I am a " +
                this.getCarMaker()
                + " sport car and sport mode is : " +
                ( this.hasSportMode() ? "activated!\n" : "deactivated!\n" );
    }

}
