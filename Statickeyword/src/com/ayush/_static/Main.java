package com.ayush._static;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance=new StaticTest("1st Instance");
        System.out.println(firstInstance.getName()+" is instance number "+ StaticTest.getNumInstances());
        StaticTest secondInstance=new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName()+" is instance number "+StaticTest.getNumInstances());
    }
}
