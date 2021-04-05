import java.util.Scanner;
public class array {
    public static void main(String[]args){
        int arr[]=new int[5];
        System.out.println("Enter array elements");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Elements in array :"+arr[i]);
        }
    }
}
