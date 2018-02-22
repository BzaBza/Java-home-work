package com.company;

public abstract class User {
    protected String userName;
    protected User(String userName) {
        this.userName = userName;
    }
    public abstract String getComment(String comment);

}
