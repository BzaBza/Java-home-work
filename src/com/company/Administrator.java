package com.company;


import java.util.ArrayList;

public class Administrator extends User {

    private String userName;

    public Administrator(String userName) {
        this.userName = userName;
    }

    @Override
    public ArrayList<String> addComment(String comment){
        states.add(comment);
        return states;
    }
    public int numberOfComments (){
        int howManyComments =  states.size();
        return howManyComments;
    }
}
