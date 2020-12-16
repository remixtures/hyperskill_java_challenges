package com.miguelcaetano.hyperskill.object_oriented_programming.bank_account;

class BankAccount {

    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {

    double fee;

    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}

class SavingAccount extends BankAccount {

    double interestRate;

    public SavingAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }
}
