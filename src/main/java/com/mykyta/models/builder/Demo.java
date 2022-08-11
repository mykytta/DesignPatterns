package com.mykyta.models.builder;

public class Demo {
    public static void main(String[] args) {
        UserCreator userCreator = new UserCreator();

        userCreator.setUserBuilder(new UserB());
        User user = userCreator.createUser();

        System.out.println(user);
    }
}
