import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main
{

    private static Scanner in;
    public static void main(String[] argv) throws Exception
    {
        in = new Scanner(System.in);
        System.out.print("Enter the year and month (eg. 2018-01) : ");
        String year = in.next();
        String input=year+"-1";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(input);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Weekdays of the month : ");
        if(week!=7&&week!=1)
        {
            System.out.println(input);
        }
        int month1=cal.get(Calendar.MONTH);
        for(int i=2;i<=31;i++)
        {
            input=year+"-"+i;

            sdf = new SimpleDateFormat("yyyy-MM-dd");
            date = sdf.parse(input);
            cal = Calendar.getInstance();
            cal.setTime(date);
            week = cal.get(Calendar.DAY_OF_WEEK);
            int month2=cal.get(Calendar.MONTH);
            if(month1!=month2)
                break;
            if(week!=7&&week!=1)
            {
                System.out.println(input);
            }
        }
    }
}