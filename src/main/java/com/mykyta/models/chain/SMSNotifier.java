package com.mykyta.models.chain;

public class SMSNotifier extends Notifier{

    public SMSNotifier(int importance) {
        super(importance);
    }

    @Override
    public void write(String massage) {
        System.out.println("Sending SMS: " + massage);
    }
}
