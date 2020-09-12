import java.util.Scanner;

public class Factorial {
public static void main(String[]args){
    Scanner n=new Scanner(System.in);
    int factorial=1;
    System.out.println("Enter number you want factorial of :");
    int number=n.nextInt();
    for(int i=1;i<=number;i++){
    factorial=factorial*i;
    }
    System.out.println(factorial);
}
}
