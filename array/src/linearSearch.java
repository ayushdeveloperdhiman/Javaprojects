import java.util.*;
public class linearSearch {
    public static void main(String[]args){
        Scanner n=new Scanner(System.in);
        int f=0;
        int arr[]={1,5,25,85,65};
        System.out.println("Enter the elements you want to search");
        int item=n.nextInt();
        for(int i=0;i<arr.length;i++){
            if(item==arr[i]){
                f=1;
                System.out.println("Element found at index "+i);
                break;
            }
        }
        if(f==0){
            System.out.printf("Element not found");
        }
    }
}
