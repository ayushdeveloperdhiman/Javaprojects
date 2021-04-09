import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        System.out.print("Enter a number = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f=0;
        int t=n;
        int sum=0;
        while (n > 0) {
            int r = n % 10;
            f = Fact(r);
            sum=sum+f;
            n=n/10;
        }
        if(t==sum){
            System.out.println("Number is strong");
        }else{
            System.out.println("Number is not strong");
        }
    }

    public static int Fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }
}
