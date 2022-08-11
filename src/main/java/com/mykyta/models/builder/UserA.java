package com.mykyta.models.builder;

public class UserA extends UserBuilder{
    @Override
    void buildFirstName() {
        user.setFirstName("Vasyl");
    }

    @Override
    void buildLastName() {
        user.setLastName("Fedorov");
    }

    @Override
    void buildAge() {
        user.setAge(39);
    }

    @Override
    void buildId() {
        user.setId(1);
    }
}
