package com.company;

public class Administrator extends User {

     Administrator(String userName) {
        super(userName);
    }

    @Override
    public String getComment(String comment) {
        String myComment = this.userName + ": " + "This is real Admin "+ comment + " ";
        return myComment;
    }
}
