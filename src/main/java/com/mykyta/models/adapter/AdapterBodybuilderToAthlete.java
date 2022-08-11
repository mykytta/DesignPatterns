package com.mykyta.models.adapter;

public class AdapterBodybuilderToAthlete extends Bodybuilder implements Athlete {
    @Override
    public void trainCardio() {
        running();
    }

    @Override
    public void weightTraining() {
        pumpBiceps();
    }
}
