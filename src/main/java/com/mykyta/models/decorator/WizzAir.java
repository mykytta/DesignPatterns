package com.mykyta.models.decorator;

public class WizzAir implements Airline{
    @Override
    public String classAvailability() {
        return "Airline has economy class";
    }
}
