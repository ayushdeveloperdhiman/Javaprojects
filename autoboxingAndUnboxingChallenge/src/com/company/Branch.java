package com.company;
import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<Customers> customers;

    public Branch(String name,double amount){
        this.name=name;
        this.customers=new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public boolean addCustomer(String customerName,double initialAmount){
        if(findCustomer(customerName)==nul){
            this.customers.add(new Customers(customerName,initialAmount));
            return true;
        }
        return false;
    }
    public boolean addTransaction(String customerName,double initialAmount){
        Customers existingCustomer=findCustomer(customerName);
        if(existingCustomer!=null){
            existingCustomer.addTransaction();
        }

    }
}
