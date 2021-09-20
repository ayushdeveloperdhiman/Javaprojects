import java.util.Arrays;
import java.util.Scanner;

public class PasswordToUnlockFile {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        int startPoint=s.nextInt();
        int endPoint=s.nextInt();
        System.out.println(Arrays.toString(array));
        int j=0;
        for(int i=startPoint;i<endPoint-1;i++){
            j++;
            int temp=array[i];
            array[i]=array[array.length-j];
            array[array.length-j]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
