import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String []args){
        System.out.println("Enter number of elements you want in an array:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=scanner.nextInt();
        }
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
