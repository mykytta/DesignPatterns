package com.mykyta.models.factorymethod;

public class Logistics {
    public static void main(String[] args) {
        TransportLogistics transportLogistics = createTransportByName("Ship");
        Transport transport = transportLogistics.createTransport();

        transport.delivery();
    }

    static TransportLogistics createTransportByName(String transportName) {
        if(transportName.equalsIgnoreCase("Ship")) {
            return new SeaLogistics();
        }else if(transportName.equalsIgnoreCase("Plane")) {
            return new AirLogistics();
        } else if(transportName.equalsIgnoreCase("Truck")){
            return new RoadLogistics();
        }else{
            throw new RuntimeException("This transport is not available");
        }
    }
}

