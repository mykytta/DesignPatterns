package com.mykyta.models.decorator;

public class AirlineDecorator implements Airline{
    Airline airline;

    public AirlineDecorator(Airline airline) {
        this.airline = airline;
    }

    @Override
    public String classAvailability() {
        return airline.classAvailability();
    }
}
