import java.util.*;
import java.text.*;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat nf     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf1  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat nf2  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us=nf.format(payment);
        String india=nf1.format(payment);
        String china=nf2.format(payment);
        String france=nf3.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}