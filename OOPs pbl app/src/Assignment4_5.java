import java.util.Scanner;

public class Assignment4_5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = s.nextLine();
        System.out.println(firstLastCharacterRemove(str));
    }
    public static String firstLastCharacterRemove(String str){
        return str.substring(1,str.length()-1);
    }
}
