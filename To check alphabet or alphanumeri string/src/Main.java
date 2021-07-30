import java.util.Scanner;

public class Main
{
    //method to check string is alphanumeric or not
    public static boolean isAlphaNumeric(String s)
    {
        //regular expression pattern
        String pattern= "^[a-zA-Z0-9]*$";
        return s.matches(pattern);
    }
    //method to check string is alphabetic or not
    public static boolean isAlphabetic(String s)
    {
        //regular expression pattern
        String pattern= "^[a-zA-Z]*$";
        return s.matches(pattern);
    }
    private static Scanner in;
    public static void main(String args [])
    {
        String str;
        //print statement in java
        System.out.print("Enter the string ");
        in = new Scanner(System.in);
        str=in.nextLine();
        if(isAlphabetic(str))
        {
            System.out.println("String is alphabetic");
        }
        else if(isAlphaNumeric(str))
        {
            System.out.println("String is alphanumeric");
        }
        else
        {
            System.out.println("String is neither alphabetic or alphanumeric");
        }
    }

}