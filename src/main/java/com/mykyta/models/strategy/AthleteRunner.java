package com.mykyta.models.strategy;

public class AthleteRunner {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();

        athlete.setActivity(new Sleeping());
        athlete.executeActivity();

        athlete.setActivity(new Run());
        athlete.executeActivity();

        athlete.setActivity(new Cycling());
        athlete.executeActivity();

        athlete.setActivity(new PushUps());
        athlete.executeActivity();

        athlete.setActivity(new Sleeping());
        athlete.executeActivity();

    }
}
