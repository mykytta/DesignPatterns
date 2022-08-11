package com.mykyta.models.memento;

import java.util.Date;

public class Game {
    private String level;
    private Date date;

    public void load(Save save){
        level = save.getLevel();
        date = save.getDate();
    }

    public Save save(){
        return new Save(level);
    }

    public void set(String level){
        this.level = level;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", date=" + date +
                '}';
    }
}
