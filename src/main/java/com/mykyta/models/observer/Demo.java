package com.mykyta.models.observer;

public class Demo {
    public static void main(String[] args) {
        MessagePublisher messagePublisher = new MessagePublisher();
        MessageSubscriber s1 = new MessageSubscriber("Alex");
        MessageSubscriber s2 = new MessageSubscriber("Vladislav");
        MessageSubscriber s3 = new MessageSubscriber("Vladimir");

        messagePublisher.addObserver(s1);
        messagePublisher.addObserver(s2);

        messagePublisher.notifyObservers("You have got this message : 111");

        messagePublisher.removeObserver(s2);
        messagePublisher.addObserver(s3);

        messagePublisher.notifyObservers("You have got this message : 11221");
    }
}
