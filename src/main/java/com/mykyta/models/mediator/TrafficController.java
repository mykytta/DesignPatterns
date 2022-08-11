package com.mykyta.models.mediator;

public class TrafficController implements User{
    private Connection connection;
    private String airportName;

    public TrafficController(Connection connection, String airportName) {
        this.connection = connection;
        this.airportName = airportName;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public void sendMessage(String message) {
        connection.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.airportName + " receiving message: " + message);
    }
}
