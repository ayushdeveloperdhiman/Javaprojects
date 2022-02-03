package com.ayush;

public class User {
    private String username;
    private String password;
    private String gender;
    private int age;

    protected User(String username,String password,String gender,int age){
        this.username=username;
        this.password=password;
        this.gender=gender;
        this.age=age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
