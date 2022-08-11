package com.mykyta.models.mediator;

public class ControllerPilotConnectionRunner {
    public static void main(String[] args) {
        ControllerPilotConnection connection = new ControllerPilotConnection();

        User controller = new TrafficController(connection, "KBP");
        User pilot1 = new Pilot(connection, "051NO");
        User pilot2 = new Pilot(connection, "022FO");

        connection.setTrafficController(controller);
        connection.addPilot(pilot1);
        connection.addPilot(pilot2);

        pilot1.sendMessage("Ready for take-off!");
        controller.sendMessage("Cleared for take-off");

    }
}
