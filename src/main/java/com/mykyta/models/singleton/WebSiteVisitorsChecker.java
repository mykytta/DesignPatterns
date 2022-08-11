package com.mykyta.models.singleton;

public class WebSiteVisitorsChecker {
    private static volatile WebSiteVisitorsChecker webSiteVisitorsChecker;
    private int activeVisitors;

    private WebSiteVisitorsChecker(){};

    public static synchronized WebSiteVisitorsChecker getVisitorsChecker(){
        if(webSiteVisitorsChecker == null){
            webSiteVisitorsChecker = new WebSiteVisitorsChecker();
        }

        return webSiteVisitorsChecker;
    }

    public void addNewVisitor(){
        activeVisitors++;
    }

    public void showVisitors(){
        System.out.println(activeVisitors);
    }
}
