package com.mykyta.models.chain;

public class EmailNotifier extends Notifier{

    public EmailNotifier(int importance) {
        super(importance);
    }

    @Override
    public void write(String massage) {
        System.out.println("Sending email: " + massage);
    }
}
