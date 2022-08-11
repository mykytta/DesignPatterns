package com.mykyta.models.facade;


public class Site {
    public void printContent(UserChecker userChecker){
        if(userChecker.userIsActive()) {
            System.out.println("Print out some content");
        }else{
            System.out.println("Display black screen");
        }

    }
}
