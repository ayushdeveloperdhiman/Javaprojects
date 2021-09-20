
import java.util.Scanner;

public class DormantAccount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] acc=new int[10];
        for(int i=0;i<n;i++){
            acc[i]= s.nextInt();
        }

        int count=0;
        for(int i=0;i<acc.length;i++){
            if(acc[i]<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
