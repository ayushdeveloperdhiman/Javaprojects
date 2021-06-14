package com.ayush;

import java.util.ArrayList;

public class Account {
    protected String accountName;
    protected int balance=0;
    private ArrayList<Integer> transactions;
    public Account(String accountName){
        this.accountName=accountName;
        this.transactions=new ArrayList<>();
    }
    public int getBalance(){
        return this.balance;
    }
    public void deposit(int amount){
        if(amount>0){
            transactions.add(amount);
            balance+=amount;
            System.out.println(amount+" deposited, current balance: "+balance);
        }else{
            System.out.println("Cannot deposit negative sums.");
        }
    }
    public void withdraw(int amount){
        int withdrawal=-amount;
        if(withdrawal<0){
            transactions.add(withdrawal);
            balance+=withdrawal;
            System.out.println(amount+" withdrawn, current balance: "+balance);
        }else{
            System.out.println("Cannot withdraw negative sums.");
        }
    }
    public void calculateBalance(){
        balance=0;
        for (int i:transactions){
            balance+=i;
        }
        System.out.println("Calculated balance is: "+balance);
    }
}
