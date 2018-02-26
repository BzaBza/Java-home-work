package com.company;

public abstract class User {
    protected String userName;
    protected User(String userName) {
        this.userName = userName;
    }
    public String getComment(String comment){
        String myComment = comment + "default comment";
        return myComment;
    }
}
