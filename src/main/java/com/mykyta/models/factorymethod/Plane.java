package com.mykyta.models.factorymethod;

public class Plane implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivery is by air");
    }
}
