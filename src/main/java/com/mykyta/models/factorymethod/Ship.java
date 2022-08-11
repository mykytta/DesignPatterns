package com.mykyta.models.factorymethod;

public class Ship implements Transport{
    @Override
    public void delivery() {
        System.out.println("Delivery is by sea");
    }
}
