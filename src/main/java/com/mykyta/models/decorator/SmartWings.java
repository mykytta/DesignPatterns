package com.mykyta.models.decorator;

public class SmartWings extends AirlineDecorator{

    public SmartWings(Airline airline) {
        super(airline);
    }

    public String businessClass(){
        return " + business class";
    }

    public String classAvailability(){
        return super.classAvailability() + businessClass();
    }
}
