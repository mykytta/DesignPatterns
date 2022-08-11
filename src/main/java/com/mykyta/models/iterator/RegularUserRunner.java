package com.mykyta.models.iterator;

public class RegularUserRunner {
    public static void main(String[] args) {
        String[] friends = {"Vasyl", "Ivan", "Petro"};
        RegularUser regularUser = new RegularUser("Alex", friends);
        Iterator iterator = regularUser.getIterator();
        System.out.println("User: " + regularUser.getName());
        System.out.print("Friends: ");

        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + "; ");
        }
    }
}
