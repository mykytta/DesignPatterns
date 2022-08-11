package com.mykyta.models.abstractfactory.phones;

public class ApplePhone implements Phone{
    @Override
    public void printModel() {
        System.out.println("iPhone 13 Pro");
    }
}
