package javabasic6.vehicles.bikes;

import javabasic6.vehicles.ElectricalMotorized;
import javabasic6.vehicles.EngineMotorized;

public class MotorizedBike
        extends Bike
        implements ElectricalMotorized, EngineMotorized {
    private int horsePower;
    private String engineType;
    private int chargeTime;

    public MotorizedBike(int numarRoti, int numarLocuri) {
        super(numarRoti, numarLocuri);
    }

    @Override
    public void convertToElectrical(int chargeTime) {
        this.chargeTime = chargeTime;
    }

    @Override
    public void addEngine(int horsePower, String engineType) {
        this.engineType = engineType;
        this.horsePower = horsePower;
    }
}
