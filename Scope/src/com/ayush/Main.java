package com.ayush;

public class Main{
    public static void main(String[] args){
        String varFour="This is varFour to main()";
        ScopeCheck scopeInstance =new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("Scope instance varOne is "+scopeInstance.getVarOne());
        System.out.println(varFour);
        scopeInstance.timesTwo();
        System.out.println("****************************************");
        ScopeCheck.InnerClass innerClass =scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
