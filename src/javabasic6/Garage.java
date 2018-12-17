package javabasic6;

import javabasic6.vehicles.Vehicle;
import javabasic6.vehicles.motorizedvehicles.MotorizedVehicle;
import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }


    public String displayGarageContents() {
        String content = "";

        for (Vehicle vehicle: vehicles) {
            content += vehicle;
            // this line above is the same as the line below
            //content += vehicle.toString();
        }

        return content;
    }

    @Override
    public String toString() {
        String content = "";

        for (Vehicle vehicle: vehicles) {
            content += vehicle;
            // this line above is the same as the line below
            //content += vehicle.toString();
        }

        return content;
    }
}
