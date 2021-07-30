import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Main
{
    private static Scanner in;
    public static void main(String arg[]) throws ParseException
    {
        in = new Scanner(System.in);
        System.out.println("Enter the date (yyyy-MM-dd) : ");
        String input =in.nextLine();
        String format = "yyyyMMdd";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try
        {
            date = sdf.parse(input);
        }
        catch(Exception e)
        {
            System.out.println("Invalid date !");
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        if(week==1)
            System.out.println("Sunday");
        if(week==2)
            System.out.println("Monday");
        if(week==3)
            System.out.println("Tuesday");
        if(week==4)
            System.out.println("Wednesday");
        if(week==5)
            System.out.println("Thursday");
        if(week==6)
            System.out.println("Friday");
        if(week==7)
            System.out.println("Saturday");
    }
}