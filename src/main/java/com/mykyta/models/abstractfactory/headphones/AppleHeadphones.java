package com.mykyta.models.abstractfactory.headphones;

public class AppleHeadphones implements Headphones{
    @Override
    public void printModel() {
        System.out.println("Apple Airpods");
    }
}
