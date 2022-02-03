package com.company;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={6,7,8,9};
        System.out.println(Arrays.toString(reverseArray(arr)));
        System.out.println(Arrays.toString(reverseArray(arr2)));
    }
    public static int[] reverseArray(int [] arr){
        for(int i=0;i< arr.length/2;i++){
            int a=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=a;
        }
        return arr;
    }
}
