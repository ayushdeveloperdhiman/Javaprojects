package com.ayush;

public class Password {
    private static final int key=7018515;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword =encryptDecrypt(password);
    }
    public int encryptDecrypt(int password){
        return password ^ key;
    }
    public final void storePassword(){
        System.out.println("Saving password as "+this.encryptedPassword);
    }
    public boolean letMeIn(int password){
        if(encryptDecrypt(password)==encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("Nope, you can't come in");
            return false;
        }
    }
}
