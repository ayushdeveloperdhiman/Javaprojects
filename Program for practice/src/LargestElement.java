import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        System.out.println("Enter number of elements you want");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] array =new int[n];
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        System.out.println(largest(array,n));
    }
    static int largest(int[] array, int n){
        if(n==0){
            return 0;
        }
        return (Math.max(array[n-1], largest(array,n-1) ));
    }

}
