import java.util.Scanner;

public class ReverseString1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer(s.nextLine());
        System.out.println(sb.reverse());
    }
}
