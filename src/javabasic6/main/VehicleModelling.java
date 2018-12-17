package javabasic6.main;

import javabasic6.Garage;
import javabasic6.vehicles.ElectricalMotorized;
import javabasic6.vehicles.Vehicle;
import javabasic6.vehicles.bikes.Bike;
import javabasic6.vehicles.bikes.Motorcycle;
import javabasic6.vehicles.Tank;
import javabasic6.vehicles.bikes.MotorizedBike;
import javabasic6.vehicles.motorizedvehicles.MotorizedVehicle;
import javabasic6.vehicles.motorizedvehicles.cars.Passenger;
import javabasic6.vehicles.motorizedvehicles.cars.Sport;

public class VehicleModelling {
    public static void main(String[] args) {
        Vehicle car = new Passenger(4, 5, 2000,
                "Skoda");
        MotorizedVehicle tank = new Tank(10, 5, 6000);
        MotorizedVehicle motorcycle = new Motorcycle(2, 2, 1450);

        Garage garage = new Garage();
        garage.addVehicle(car);
        garage.addVehicle(motorcycle);
        garage.addVehicle(new Sport(4, 2, 5000,
                "Masseratti", true));

        Bike bike = new Bike(2, 1);
        garage.addVehicle(bike);

        //System.out.println(garage.displayGarageContents());
        //garage.removeVehicle(motorcycle);

        System.out.println(garage);

       // System.out.println(garage.displayGarageContents());

        System.out.println();

        ((Passenger) car).convertToElectrical(2);
        System.out.println(garage);

        ElectricalMotorized electricalMotorizedBike = new MotorizedBike(2,1);
        ElectricalMotorized electricCar = new Passenger(4,
                5,1000, "Tesla");

        System.out.println(ElectricalMotorized.ElectricalText);
        //anonymous object
        new Garage().addVehicle(
                new Motorcycle(2, 2, 900));


    }
}
