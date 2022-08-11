package com.mykyta.models.state;

public class Training {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Athlete athlete = new Athlete();

        athlete.setActivity(activity);

        for(int i = 0; i < 10; i++){
             athlete.justDoIt();
             athlete.changeActivity();
        }
    }
}
