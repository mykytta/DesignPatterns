package com.mykyta.models.decorator;

public class QatarAirways extends AirlineDecorator{
    public QatarAirways(Airline airline) {
        super(airline);
    }

    public String firstClass(){
        return " + first class";
    }

    public String classAvailability(){
        return super.classAvailability() + firstClass();
    }
}
