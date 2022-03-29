import java.util.Scanner;

public class Assignment4_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First String :");
        String s1=s.nextLine().toLowerCase();
        System.out.print("Enter Second String :");
        String s2=s.nextLine().toLowerCase();
        System.out.println(concatenateString(s1,s2));
    }

    public static String concatenateString(String str1,String str2){
        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            return str1.substring(0,str1.length()-1)+" "+str2;
        }
        return str1+" "+str2;
    }
}
