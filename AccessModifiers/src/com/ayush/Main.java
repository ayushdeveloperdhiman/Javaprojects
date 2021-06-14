package com.ayush;

public class Main {
    public static void main(String[] args){
        Account ayushsAccount=new Account("Ayush");
        ayushsAccount.deposit(1000);
        ayushsAccount.withdraw(500);
        ayushsAccount.withdraw(-200);
        ayushsAccount.deposit(-20);
        ayushsAccount.calculateBalance();

        System.out.println("Balance on account is: "+ayushsAccount.getBalance());

        ayushsAccount.calculateBalance();
    }
}
