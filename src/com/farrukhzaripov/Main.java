package com.farrukhzaripov;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("FZ");
        account.deposit(500);
        account.withdraw(600);

        System.out.println(account.getBalance());

    }
}