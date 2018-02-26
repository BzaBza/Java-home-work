package com.company;

public class Main {
    public static void main(String[] args) {
        User user = new PrimeUser("Grisha");
        String comment = user.getComment("comment");

        Comments comments = new Comments();
        comments.addComment(comment);
        comments.removeComment(comment);
    }
}
