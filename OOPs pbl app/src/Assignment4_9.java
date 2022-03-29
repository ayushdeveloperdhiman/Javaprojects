import java.util.Scanner;

public class Assignment4_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First String ");
        String a = s.nextLine();
        System.out.println("Enter Second String ");
        String b = s.nextLine();
        System.out.println(rearrangeCharacter(a,b));
    }
    public static String rearrangeCharacter(String str,String str1){
        int smallString = str1.length() > str.length()? str.length() : str1.length();
        String lString = str1.length() > str.length()? str1 : str;
        String result ="";
        for(int i=0 ;i<smallString;i++){
            result += str.charAt(i);
            result += str1.charAt(i);
        }
        return result + lString.substring(smallString);
    }
}
