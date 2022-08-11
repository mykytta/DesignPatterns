package com.mykyta.models.template;

public class AirlinePriorityMember extends AirlineWebsiteTemplate{

    @Override
    public void showPrice() {
        System.out.println("Only for 50 euro");
    }
}
