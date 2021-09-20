import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=s.nextInt();
        System.out.println("Binary form :");
        System.out.println(Integer.toBinaryString(num));
    }
}
