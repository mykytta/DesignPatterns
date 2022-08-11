package com.mykyta.models.template;

public class AirlineWebsiteRunner {
    public static void main(String[] args) {
        AirlineWebsiteTemplate airlinePriorityMember = new AirlinePriorityMember();
        AirlineWebsiteTemplate regularVisitor = new RegularVisitor();

        airlinePriorityMember.showPage();
        System.out.println("===============================");
        regularVisitor.showPage();
    }
}
