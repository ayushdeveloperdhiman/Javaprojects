import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string you want to reverse");
        String s=scanner.nextLine();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String string) {
        if (string.isEmpty()){
            return string;
        }
        return reverseString(string.substring(1))+string.charAt(0);
    }
}
