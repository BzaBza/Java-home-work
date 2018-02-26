package com.company;

public class PrimeUser extends User {

    public PrimeUser(String userName) {
        super(userName);
    }

    @Override
    public String getComment(String comment) {
        String myComment = this.userName + ": " + "This is prime " + comment + " ";
        return myComment;
    }
}
