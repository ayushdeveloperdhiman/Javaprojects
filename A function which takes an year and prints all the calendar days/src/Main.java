import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Main {
    private static Scanner input;
    public static void main(String[] args) throws Exception
    {
        input = new Scanner(System.in);
        System.out.print("Enter the year then press Enter : ");
        int Y = input.nextInt();
        String dateInput=Y+"-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateInput);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int startDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK)-1;
        int spaces = startDayOfMonth;


        String[] months = {
                "",
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };

        int[] days = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        for (int M = 1; M <= 12; M++) {


            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
                days[M] = 29;



            System.out.println("          "+ months[M] + " " + Y);


            System.out.println("_____________________________________");
            System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");


            spaces = (days[M-1] + spaces)%7;


            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
            }

            System.out.println();
        }
    }
}