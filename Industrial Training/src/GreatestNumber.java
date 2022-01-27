import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=s.nextInt();
        System.out.println("Enter second number");
        int b=s.nextInt();
        if(a>b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }
    }
}
