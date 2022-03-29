import java.util.Scanner;

public class Assignment4_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = s.nextLine();
        System.out.println(returnFirstHalf(str));
    }

    public static String returnFirstHalf(String str){
        if(str.length() % 2 == 0){
            return str.substring(0,str.length()/2);
        }
        return null;
    }
}
