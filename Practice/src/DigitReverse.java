import java.util.Scanner;

public class DigitReverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a digit");
        int digit=s.nextInt();
        int reverse=0;
        while(digit!=0){
            int remainder=digit%10;
            reverse=(reverse*10)+remainder;
            digit/=10;


        }
        System.out.println(reverse);
    }
}
