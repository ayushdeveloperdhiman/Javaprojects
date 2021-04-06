import java.util.Scanner;

public class rotatingArrayElements {
    public static void main(String[]args){
        System.out.println("Enter the number of elements you want in array");
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int arr[]=new int[n1];
        System.out.println("Enter "+n1+" elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter how many numbers of first elements you want at last");
        int n2=s.nextInt();
        for(int j=0;j<n2;j++) {
            int t = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length-1] = t;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Elements in array :"+arr[i]);
        }
    }
}
