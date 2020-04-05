package com.balajiprabhu;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(20000);
        account.deposit(18000);
        account.withDrawl(23000);
        System.out.println(account.getBalance());
    }

}
