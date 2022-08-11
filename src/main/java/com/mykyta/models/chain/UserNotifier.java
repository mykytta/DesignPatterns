package com.mykyta.models.chain;

public class UserNotifier {
    public static void main(String[] args) {
        Notifier SMSNotifier = new SMSNotifier(Level.REGULAR);
        Notifier emailNotifier = new EmailNotifier(Level.DESIRABLE);
        Notifier callNotifier = new CallNotifier(Level.MAIN);

        SMSNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(callNotifier);

        SMSNotifier.notifyUser("Visit a meeting with friends", Level.REGULAR);
        SMSNotifier.notifyUser("Visit a meeting with family", Level.DESIRABLE);
        SMSNotifier.notifyUser("You need to come to graduation to pick up your diploma", Level.MAIN);
    }
}
