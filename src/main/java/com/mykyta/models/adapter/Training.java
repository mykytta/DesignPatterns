package com.mykyta.models.adapter;

public class Training {
    public static void main(String[] args) {
        Athlete athlete = new AdapterBodybuilderToAthlete();

        athlete.trainCardio();
        athlete.weightTraining();
    }
}
