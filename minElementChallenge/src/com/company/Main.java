package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count :");
        int count = s.nextInt();
        int[] returnedArray=readIntegers(count);
        System.out.println("Min :"+findMin(returnedArray));
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " elements :\r");
        for (int i = 0; i < count; i++) {
            array[i] = s.nextInt();
        }
        return array;
    }
    private static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value=array[i];
            if(value<min){
                min=value;
            }
        }
        return min;
    }
}
