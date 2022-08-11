package com.mykyta.models.factorymethod;

public class SeaLogistics implements TransportLogistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
