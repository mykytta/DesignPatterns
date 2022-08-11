package com.mykyta.models.builder;

public class UserB extends UserBuilder{
    @Override
    void buildFirstName() {
        user.setFirstName("Mykola");
    }

    @Override
    void buildLastName() {
        user.setLastName("Saghan");
    }

    @Override
    void buildAge() {
        user.setAge(18);
    }

    @Override
    void buildId() {
        user.setId(2);
    }
}
