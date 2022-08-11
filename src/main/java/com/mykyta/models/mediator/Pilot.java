package com.mykyta.models.mediator;

public class Pilot implements User{
    private Connection connection;
    private String aircraftName;

    public Pilot(Connection connection, String aircraftName) {
        this.connection = connection;
        this.aircraftName = aircraftName;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    @Override
    public void sendMessage(String message) {
        connection.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.aircraftName + " receiving message: " + message);
    }
}
