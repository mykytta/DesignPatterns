package com.mykyta.models.facade;

public class SiteVisit {
    Server server = new Server();
    UserChecker userChecker = new UserChecker();
    Site site = new Site();

    public void siteVisit(){
        server.startServer();
        userChecker.userOnSite();
        site.printContent(userChecker);
    }
}
