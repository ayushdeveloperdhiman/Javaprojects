import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println("Reversed String :");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
