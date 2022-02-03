package com.ayush;

public class Main {

    public static void main(String[] args) {
        MyApplication myApplication=new MyApplication();
        myApplication.logIn("Ayush","Ayush@0711");
        myApplication.signUp("Ayu","Ayush@0711","male",22);
        myApplication.logIn("Ayu","Ayush@0711");
    }
}
