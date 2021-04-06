import java.util.Scanner;

public class bubbleSort {
    public static void main(String[]args){
        System.out.println("Enter the number of elements you want in your array");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int t;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    t=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Elements in array :"+arr[i]);
        }
    }
}
