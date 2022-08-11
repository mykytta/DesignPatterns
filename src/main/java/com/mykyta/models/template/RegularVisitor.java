package com.mykyta.models.template;

public class RegularVisitor extends AirlineWebsiteTemplate {
    @Override
    public void showPrice() {
        System.out.println("Only for 125 euro");
    }
}
