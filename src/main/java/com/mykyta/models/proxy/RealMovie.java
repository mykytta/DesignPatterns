package com.mykyta.models.proxy;

public class RealMovie implements Movie{

    String file;

    public RealMovie(String file) {
        this.file = file;
        load();
    }

    void load(){
        System.out.println("Loading " + file);
    }

    @Override
    public void show() {
        System.out.println("Show " + file);
    }
}
