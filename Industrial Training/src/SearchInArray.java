import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the element you want to search :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i:arr){
            if(i==n){
                System.out.println("Element found.");
                System.exit(0);
            }
        }
        System.out.println("Element not found!");
    }
}
