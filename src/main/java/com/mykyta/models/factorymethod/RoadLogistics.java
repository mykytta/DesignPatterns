package com.mykyta.models.factorymethod;

public class RoadLogistics implements TransportLogistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
