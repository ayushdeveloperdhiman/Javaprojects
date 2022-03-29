package exception_handling;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array");
            int[] arr = new int[Integer.valueOf(s.nextLine())];//Here Integer.valueOf() is used to generate NumberFormatException as per the question.
            System.out.println("Enter the elements in the array");
            for(int i = 0;i < arr.length;i++){
                arr[i] = Integer.valueOf(s.nextLine());
            }
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.valueOf(s.nextLine());
            System.out.println("The array element at index "+index+" = "+arr[index]);
            System.out.println("The array element successfully accessed");
        }catch (Exception e){
            System.out.println(e.getClass());
        }

    }
}
