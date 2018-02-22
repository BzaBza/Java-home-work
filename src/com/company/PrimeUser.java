package com.company;

public class PrimeUser extends User {

    private String userName;

    public PrimeUser(String userName) {
        this.userName = userName;
    }

    @Override
    public String getComment(String comment) {
        String myComment = comment + "This is real prime"+ userName;
        return myComment;
    }
}
