package com.mykyta.models.template;

public abstract class AirlineWebsiteTemplate {
    public void showPage(){
        System.out.println("Berlin Paris flight ticket: ");
        showPrice();
        System.out.println("on August 22");
    }

    public abstract void showPrice();
}
