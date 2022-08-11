package com.mykyta.models.composite;

import java.util.ArrayList;
import java.util.List;

public class Army implements Soldier{
    private List<Soldier> soldierList = new ArrayList<>();

    public void addSoldier(Soldier soldier){
        soldierList.add(soldier);
    }

    public void removeSoldier(Soldier soldier){
        soldierList.remove(soldier);
    }

    @Override
    public void completeTheTask() {
        for(Soldier soldier: soldierList){
            soldier.completeTheTask();
        }
    }
}
