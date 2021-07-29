import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of elements you want in an array:");
        int n= scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=scanner.nextInt();
        }
        bubbleSort(array);
    }
    static void bubbleSort(int []array){
        for(int i=0;i< array.length-1;i++){
            for(int j=0;j< array.length-i-1;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
