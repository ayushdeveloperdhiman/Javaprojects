import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Enter number of elements you want in an array:");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]=scanner.nextInt();
        }
        sort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    static void merge(int[] arr)
    {

    }

    static void sort(int arr[], int beg, int end)
    {
        if (beg<end)
        {
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
            sort(arr , mid+1, end);
            merge(arr, beg, mid, end);
        }
    }
}
