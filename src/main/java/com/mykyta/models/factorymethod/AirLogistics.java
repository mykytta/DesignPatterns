package com.mykyta.models.factorymethod;

public class AirLogistics implements TransportLogistics{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
