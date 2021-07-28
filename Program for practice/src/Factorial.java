import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.printf("Enter a number");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int fact=1;
        fact=factorial(number);
        System.out.println(fact);
    }
    static int factorial(int number){
        if(number==0){
            return 1;
        }else{
            return (number*(factorial(number-1)));
        }
    }
}
