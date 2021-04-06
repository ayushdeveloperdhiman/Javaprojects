import java.util.Scanner;

public class prime {
    public static void main(String[]args){
        System.out.println("Enter the number you want to check:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                System.out.println("not prime");
                break;
            }
        }if(flag==0)
        System.out.printf("prime");
    }
}
