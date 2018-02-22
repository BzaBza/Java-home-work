package com.company;

public class Main {
    public static void main(String[] args) {
        PrimeUser primeUser = new PrimeUser("Prime");
        primeUser.getComment("Prime comment");

        Administrator administrator = new Administrator("Admin");
        administrator.getComment("admin comment");

        CommentsList commentsList = new CommentsList();
        commentsList.addComment("NE TO");

    }
}
