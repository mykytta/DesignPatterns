package com.mykyta.models.factorymethod;

public class Truck implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivery is by road");
    }
}
