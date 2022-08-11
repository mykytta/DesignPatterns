package com.mykyta.models.flyweight;

public class A350 implements Aircraft{
    @Override
    public void makeDelivery() {
        System.out.println("Covers a distance of 15000 km");
    }
}
