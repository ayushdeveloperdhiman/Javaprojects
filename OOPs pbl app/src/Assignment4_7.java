import java.util.Scanner;

public class Assignment4_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = s.nextLine();
        System.out.println(removeX(str));
    }
    public static String removeX(String str){
        if (str.charAt(0)=='x' && str.charAt(str.length()-1) == 'x' ){
            return str.substring(1,str.length()-1);
        }
        return str;
    }
}
