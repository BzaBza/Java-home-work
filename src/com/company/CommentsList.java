package com.company;

import java.util.ArrayList;

public class CommentsList {
    private ArrayList<String> states = new ArrayList<String>();

    public ArrayList<String> addComment(String myComment) {
        states.add(myComment);
        System.out.println(states);
        return states;
    }

    public ArrayList<String> removeComment (String myComment){
        states.remove(myComment);
        return states;
    }
}
