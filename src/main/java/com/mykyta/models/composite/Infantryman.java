package com.mykyta.models.composite;

public class Infantryman implements Soldier{
    @Override
    public void completeTheTask() {
        System.out.println("Destroy enemy forces with guns");
    }
}
