package com.ayush;

public class Main {

    public static void main(String[] args) {
    /*    SomeClass one=new SomeClass("One");
SomeClass two=new SomeClass("Two");
SomeClass three = new SomeClass("Three");
        System.out.println(one.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        int pwd=451220;
        Password password=new ExtentedPassword(pwd);
        password.storePassword();
        password.letMeIn(411);
        password.letMeIn(2541221);
        password.letMeIn(101545);
        password.letMeIn(451220);*/
        System.out.println("Main method called.");
        SIBTest sibTest=new SIBTest();
        sibTest.someMethod();
        System.out.println("Owner is "+SIBTest.owner);
    }
}
