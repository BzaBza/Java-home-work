package com.company;

public class PrimeUser extends User {

    public PrimeUser(String userName) {
        super(userName);
    }

    @Override
    public String getComment(String comment) {
        String myComment = comment + "This is real prime" + super.userName;
        return myComment;
    }
}
