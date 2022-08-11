package com.mykyta.models.chain;

public class CallNotifier extends Notifier{

    public CallNotifier(int importance) {
        super(importance);
    }

    @Override
    public void write(String massage) {
        System.out.println("Making a call with this massage: " + massage);
    }
}
