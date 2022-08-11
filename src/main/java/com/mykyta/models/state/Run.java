package com.mykyta.models.state;

public class Run implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Running");
    }
}
