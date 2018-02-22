package com.company;

import java.util.ArrayList;

public class PrimeUser extends   User {

    private String userName;

    public PrimeUser(String userName) {
        this.userName = userName;
    }

    @Override
    public ArrayList<String> addComment(String comment){
        states.add(comment);
        return states;
    }
    public ArrayList<String> removeComment (String comment){
        states.remove(comment);
        return states;
    }
}
