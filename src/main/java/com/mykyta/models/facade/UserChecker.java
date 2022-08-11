package com.mykyta.models.facade;

public class UserChecker {
    private boolean activeUser;

    public boolean userIsActive() {
        return activeUser;
    }

    public void userOnSite(){
        System.out.println("User logged in");
        activeUser = true;
    }

    public void userLeavesSite(){
        System.out.println("User logged out");
        activeUser = false;
    }
}
