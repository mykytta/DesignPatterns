package com.mykyta.models.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControllerPilotConnection implements Connection{

    private User trafficController;
    private List<User> pilots = new ArrayList<>();

    public void setTrafficController(User trafficController) {
        this.trafficController = trafficController;
    }

    public void addPilot(User user){
         this.pilots.add(user);
    }
    @Override
    public void sendMessage(String massage, User user) {
        for (User pilot: pilots){
            if(pilot != user){
                pilot.getMessage(massage);
            }
        }
        trafficController.getMessage(massage);
    }
}
