package com.mykyta.models.composite;

public class Gunner implements Soldier{
    @Override
    public void completeTheTask() {
        System.out.println("Destroy enemy ammunition depots");
    }
}
