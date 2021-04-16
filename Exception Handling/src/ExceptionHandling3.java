import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter first number :");
            int a = s.nextInt();
            System.out.println("Enter second number :");
            int b = s.nextInt();
            int c = a / b;
            if (c <= 0) {
                throw new Exception("Exception occurred.");
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

