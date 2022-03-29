import java.util.Scanner;

public class Assignment4_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String :");
        System.out.println(isPalindrome(s.nextLine()));
    }
    public static boolean isPalindrome(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse =reverse+str.charAt(i);
        }
        if(reverse.equalsIgnoreCase(str)){
            return true;
        }
        return false;
    }
}
