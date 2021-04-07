import java.util.Scanner;

public class armstrong2 {
    public static void main(String[]args){
        System.out.println("Enter a number");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sum=0,count=0;
        int t=num;
        while(num>0) {
            int r = num % 10;
            num = num / 10;
            count++;
        }
        num=t;
        while(num>0){
            int r=num%10;
            num=num/10;
            sum=sum+ (int) Math.pow(r,count);
        }
        if(sum==t){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
