package com.miguelcaetano.hyperskill.object_oriented_programming.account;

public class Account {

    long balance;
    String ownerName;
    boolean locked;

    public Account(long balance, String ownerName, boolean locked) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }
}
