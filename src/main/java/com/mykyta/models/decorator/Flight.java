package com.mykyta.models.decorator;

public class Flight {
    public static void main(String[] args) {
        Airline airline = new QatarAirways(new SmartWings(new WizzAir()));

        System.out.println(airline.classAvailability());
    }
}
