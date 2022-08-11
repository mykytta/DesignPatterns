package com.mykyta.models.state;

public class Athlete {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if(activity instanceof Sleeping){
            setActivity(new Run());
        }else if(activity instanceof Run){
            setActivity(new Cycling());
        }else if(activity instanceof Cycling){
            setActivity(new PushUps());
        }else if(activity instanceof PushUps){
            setActivity(new Sleeping());
        }
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
