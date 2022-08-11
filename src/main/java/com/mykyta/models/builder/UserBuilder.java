package com.mykyta.models.builder;

public abstract class UserBuilder {
    User user;

    void createUser(){
        user = new User();
    }

    abstract void buildFirstName();
    abstract void buildLastName();
    abstract void buildAge();
    abstract void buildId();

    User getUser(){
        return this.user;
    }

}
