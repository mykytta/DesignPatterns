package com.mykyta.models.observer;

public class MessageSubscriber implements Observer{

    String name;

    public MessageSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String message) {
        System.out.println("Dear, " + name + " your message is : " + message);
    }
}
