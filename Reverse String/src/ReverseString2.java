import java.util.Scanner;

public class ReverseString2 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(s.nextLine());
        System.out.println(sb.reverse());
    }
}
