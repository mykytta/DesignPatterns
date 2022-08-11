package com.mykyta.models.builder;

public class UserCreator {
    UserBuilder userBuilder;

    public void setUserBuilder(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    User createUser(){
        userBuilder.createUser();
        userBuilder.buildFirstName();
        userBuilder.buildLastName();
        userBuilder.buildAge();
        userBuilder.buildId();

        User user = userBuilder.getUser();

        return user;
    }

}
