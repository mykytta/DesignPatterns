package com.mykyta.models.composite;

public class Task {
    public static void main(String[] args) {
        Army army = new Army();

        army.addSoldier(new Gunner());
        army.addSoldier(new Infantryman());
        army.addSoldier(new Gunner());
        army.addSoldier(new Infantryman());

        army.completeTheTask();
    }
}
