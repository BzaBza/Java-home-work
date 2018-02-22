package com.company;

import java.util.ArrayList;

public class Comments {
    private ArrayList<String> states = new ArrayList<>();

    public void addComment(String myComment) {
        states.add(myComment);
    }

    public void removeComment(String myComment) {
        states.remove(myComment);
    }
}
