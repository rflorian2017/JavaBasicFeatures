package javabasic6.main;

import javabasic6.Garage;
import javabasic6.vehicles.bikes.Motorcycle;
import javabasic6.vehicles.Tank;
import javabasic6.vehicles.Vehicle;
import javabasic6.vehicles.cars.Passenger;
import javabasic6.vehicles.cars.Sport;

public class VehicleModelling {
    public static void main(String[] args) {
        Vehicle car = new Passenger(4, 5, 2000,
                "Skoda");
        Vehicle tank = new Tank(10, 5, 6000);
        Vehicle motorcycle = new Motorcycle(2, 2, 1450);

        Garage garage = new Garage();
        garage.addVehicle(car);
        garage.addVehicle(motorcycle);
        garage.addVehicle(new Sport(4, 2, 5000,
                "Masseratti", true));

        System.out.println(garage.displayGarageContents());
        //garage.removeVehicle(motorcycle);

        System.out.println(garage);

       // System.out.println(garage.displayGarageContents());


        //anonymous object
        new Garage().addVehicle(
                new Motorcycle(2, 2, 900));


    }
}
