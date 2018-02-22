package com.company;

public class Main {
    public static void main(String[] args) {
        PrimeUser primeUser = new PrimeUser("Prime");
        primeUser.addComment("Prime comment");

        Administrator administrator = new Administrator("Admin");
        administrator.addComment("admin comment");
        administrator.numberOfComments();
    }
}
