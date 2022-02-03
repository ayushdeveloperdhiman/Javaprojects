package com.company;

import java.util.Arrays;

public class SortArray2 {
    public static void main(String[] args) {
        int[] arr={51,21,34,25,48};
        boolean flag=true;
        int temp;
        while (flag){
            flag=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=true;
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
