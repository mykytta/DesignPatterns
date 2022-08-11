package com.mykyta.models.abstractfactory.headphones;

public class SamsungHeadphones implements Headphones{
    @Override
    public void printModel() {
        System.out.println("Galaxy Buds");
    }
}
