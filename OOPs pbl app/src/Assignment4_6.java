import java.util.Scanner;

public class Assignment4_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first string :");
        String str = s.nextLine();
        System.out.print("Enter the second string :");
        String str1 = s.nextLine();
        if(str.length() == str1.length()){
            System.out.println("Strings are of same length !!!");
        }else if(str.length() < str1.length()){
            System.out.println(str+str1+str);
        }else{
            System.out.println(str1+str+str1);
        }
    }
}
