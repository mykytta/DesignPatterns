package com.mykyta.models.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CargoFactory {
    private static final Map<String, Aircraft> aircrafts = new HashMap<>();

    public Aircraft getAircraftByName(String name){
        Aircraft aircraft = aircrafts.get(name);

        if(aircraft == null){
            switch (name){
                case "A320":
                    System.out.println("Renting A320");
                    aircraft = new A320();
                    break;
                case "A350":
                    System.out.println("Renting A350");
                    aircraft = new A350();
                    break;
            }

            aircrafts.put(name, aircraft);
        }
        return aircraft;
    }
}

