package com.company;

public class Administrator extends User {

    private String userName;

    public Administrator(String userName) {
        this.userName = userName;
    }

    @Override
    public String getComment(String comment) {
        String myComment = comment + "This is real " + userName;
        return myComment;
    }
}
