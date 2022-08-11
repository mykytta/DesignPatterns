package com.mykyta.models.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Observed {

    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer o: observerList){
            o.handleEvent(message);
        }
    }
}
