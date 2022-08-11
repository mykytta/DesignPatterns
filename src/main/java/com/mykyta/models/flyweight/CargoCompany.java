package com.mykyta.models.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CargoCompany {
    public static void main(String[] args) {
        CargoFactory cargoFactory = new CargoFactory();

        List<Aircraft> aircraftList = new ArrayList<>();

        aircraftList.add(cargoFactory.getAircraftByName("A350"));
        aircraftList.add(cargoFactory.getAircraftByName("A350"));
        aircraftList.add(cargoFactory.getAircraftByName("A350"));
        aircraftList.add(cargoFactory.getAircraftByName("A350"));
        aircraftList.add(cargoFactory.getAircraftByName("A350"));
        aircraftList.add(cargoFactory.getAircraftByName("A320"));
        aircraftList.add(cargoFactory.getAircraftByName("A320"));
        aircraftList.add(cargoFactory.getAircraftByName("A320"));
        aircraftList.add(cargoFactory.getAircraftByName("A320"));

        for(Aircraft aircraft : aircraftList){
            aircraft.makeDelivery();
        }
    }
}
