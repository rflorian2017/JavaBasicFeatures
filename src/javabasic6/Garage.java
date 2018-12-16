package javabasic6;

import javabasic6.vehicles.Vehicle;
import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }


    public String displayGarageContents() {
        String content = "";

        for (Vehicle vehicle: vehicles) {
            content += vehicle.displayVehicleInfo();
        }

        return content;
    }
}
