package com.company;

import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        int[] arr=readIntegers(10);
        System.out.println(findMin(arr));
    }
    public static int[] readIntegers(int number){
        Scanner s=new Scanner(System.in);
        int [] arr=new int[number];
        System.out.println("Enter "+number+" integers :\r");
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
