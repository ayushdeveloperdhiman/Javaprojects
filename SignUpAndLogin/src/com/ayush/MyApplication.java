package com.ayush;

import java.util.ArrayList;

public class MyApplication {
    private ArrayList<User> userArrayList;

    public MyApplication(){
        userArrayList=new ArrayList<>();
    }

    public boolean signUp(String username,String password,String gender,int age){
        if(username.length()<3){
            System.out.println("Username length can't be less than 2.\n" +
                    "Sign up failed!");
            return false;
        }else if(password.length()<6){
            System.out.println("Password length can't be less than 6.\n" +
                    "Sign up failed!");
            return false;
        }
        User user=new User(username, password, gender, age);
        if(!findUser(username)){
            userArrayList.add(user);
            return true;
        }
        System.out.println("User with this username already exits\n" +
                "Try different username!");
        return false;
    }

    public boolean logIn(String userName,String password){
        if(findUser(userName, password)){
            System.out.println("Logged in as: "+userName);
            return true;
        }
        System.out.println("Can't log in.Check your credentials!");
        return false;
    }
    public boolean findUser(String username){
        for(User user: userArrayList){
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

    private boolean findUser(String username,String password){
        for(User user: userArrayList){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    private class User {
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

        private String getUsername() {
            return username;
        }

        private String getPassword() {
            return password;
        }

    }
}
