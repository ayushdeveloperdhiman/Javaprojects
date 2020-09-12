package ayush;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String First_Name = "Ayush";
        String Last_Name = "Dhiman";
        First_Name = "\u00A9 " + First_Name;
        System.out.println("My copyright name " + First_Name + " " + Last_Name);

        String number1 = "10";
        String number2 = "20";
        int a = 10, b = 20;
        System.out.println(number1 + number2);
        System.out.println(number1 + a);
        System.out.println(number2 + b + a);
        System.out.println(a + b);

    }
}
