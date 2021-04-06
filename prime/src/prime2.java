import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        System.out.println("Enter the number upto which you want to check prime number :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0,j;
        for(int i=2;i<=n;i++)
        {
            for(j=2;j<i;j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if(i==j)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
