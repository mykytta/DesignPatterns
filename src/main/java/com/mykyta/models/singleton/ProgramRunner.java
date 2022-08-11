package com.mykyta.models.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        WebSiteVisitorsChecker.getVisitorsChecker().addNewVisitor();
        WebSiteVisitorsChecker.getVisitorsChecker().addNewVisitor();
        WebSiteVisitorsChecker.getVisitorsChecker().addNewVisitor();
        WebSiteVisitorsChecker.getVisitorsChecker().addNewVisitor();

        WebSiteVisitorsChecker.getVisitorsChecker().showVisitors();
    }
}
