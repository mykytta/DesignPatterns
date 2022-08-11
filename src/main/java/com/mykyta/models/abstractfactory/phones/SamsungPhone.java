package com.mykyta.models.abstractfactory.phones;

public class SamsungPhone implements Phone{
    @Override
    public void printModel() {
        System.out.println("Samsung S22 Ultra");
    }
}
