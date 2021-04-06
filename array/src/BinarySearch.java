import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[]args){
        System.out.println("Enter the number of elements you want in your array");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the element you want to search");
        int item=s.nextInt();
        int beg=0,end=arr.length-1,mid=(beg+end)/2;
        while(beg<=end){
            if(item==arr[mid]){
                System.out.println("Item found");
                break;
            }
            else if(item>arr[mid]){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(beg+end)/2;
        }
        if(beg>end){
            System.out.println("Item not found");
        }
    }
}
