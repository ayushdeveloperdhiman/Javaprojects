import java.util.Scanner;

public class Assignment4_10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = s.nextLine();
        System.out.println("Enter a number :");
        int n = s.nextInt();
        System.out.println(returnString(str,n));
    }
    public static String returnString(String str , int n){
        if(n <= str.length()){
            String result = new String();
            for(int i=0;i<n;i++){
                result += str.substring(str.length()-n);
            }
            return result;
        }
        return "The number passed is greater than the String length.";
    }

}


