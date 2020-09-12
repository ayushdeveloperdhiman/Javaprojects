package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("My int value :" + myIntValue);
        System.out.println("Another int value :" + anotherIntValue);
        anotherIntValue++;
        System.out.println("My int value :"+myIntValue);
        System.out.println("Another int value :"+anotherIntValue);
        int[] myIntArray=new int[5];
        int[] anotherIntArray=myIntArray;
        System.out.println("My int array :"+ Arrays.toString(myIntArray));
        System.out.println("Another int array :"+Arrays.toString(anotherIntArray));
        anotherIntArray[0]=1;
        System.out.println("After change my int array :"+Arrays.toString(myIntArray));
        System.out.println("After change another int array :"+Arrays.toString(anotherIntArray));
        anotherIntArray=new int[] {40,50,60,70,80};//remove it to understand reference.
        modifyArray(myIntArray);
        System.out.println("After modify my int array :"+Arrays.toString(myIntArray));
        System.out.println("After modify another int array :"+Arrays.toString(anotherIntArray));
    }
    private static void modifyArray(int[] array){
        array[0]=2;
        array=new int[] {1,2,3,4,5};
    }
}
