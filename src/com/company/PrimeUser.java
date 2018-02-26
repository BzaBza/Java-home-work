package com.company;

public class PrimeUser extends User {

    public PrimeUser(String userName) {
        super(userName);
    }

    public String getComment(String comment) {
        String myComment = comment + "This is real prime" + userName ;
        return myComment;
    }
}
