package com.company;

public class Main {
    public static void main(String[] args) {
        PrimeUser primeUser = new PrimeUser("Prime");
        String primeComment = primeUser.getComment("Prime comment");

        Administrator administrator = new Administrator("Admin");
        administrator.getComment("admin comment");

        Comments comments = new Comments();
        comments.addComment(primeComment);
    }
}
