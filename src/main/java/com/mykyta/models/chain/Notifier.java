package com.mykyta.models.chain;

public abstract class Notifier {
    private int importance;
    private Notifier nextNotifier;

    public Notifier(int importance) {
        this.importance = importance;
    }

    public void setNextNotifier(Notifier nextNotifier){
        this.nextNotifier = nextNotifier;
    }

    public void notifyUser(String massage, int level){
        if(level >= importance){
            write(massage);
        }

        if(nextNotifier != null){
            nextNotifier.notifyUser(massage, level);
        }
    }

    public abstract void write(String massage);
}
