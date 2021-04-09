import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int index=0;
        int arr[]=new int[40];
        while (n > 0) {
            arr[index++] = n % 2;
            n = n / 2;
        }
        for(int i=index-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
