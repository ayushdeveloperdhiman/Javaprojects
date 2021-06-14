package com.ayush;

public class ExtentedPassword extends Password{
    private int decryptedPassword;

    public ExtentedPassword(int password) {
        super(password);
        this.decryptedPassword=password;
    }

    /*public void storePassword() {
        System.out.println("Saving password as :"+this.decryptedPassword);
    }*/
}
