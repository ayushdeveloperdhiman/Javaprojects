import java.util.Scanner;

public class Assignment4_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str= s.nextLine();

        System.out.println(returnString(str));

    }

    public static String returnString(String str){
        String result = "";
        for(int i = 0;i<str.length();i++){
            result +=str.substring(0,2);
        }
        return result;
    }
}
