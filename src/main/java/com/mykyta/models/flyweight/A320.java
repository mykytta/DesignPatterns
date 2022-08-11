package com.mykyta.models.flyweight;

public class A320 implements Aircraft{
    @Override
    public void makeDelivery() {
        System.out.println("Covers a distance of 6000 km");
    }
}
