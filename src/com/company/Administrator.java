package com.company;

public class Administrator extends User {

     Administrator(String userName) {
        super(userName);
    }

    @Override
    public String getComment(String comment) {
        String myComment = comment + "This is real " + userName;
        return myComment;
    }
}
