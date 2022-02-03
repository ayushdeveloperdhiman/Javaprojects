package com.company;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={105,254,14,34,71,12,10};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
