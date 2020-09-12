package ayush;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20.00, secondValue = 80.00;
        double result = ((firstValue + secondValue) * 100) % 40.00;
        System.out.println(result);
        boolean checkremainder = (result == 0) ? true : false;
        System.out.println(checkremainder);
        if (!checkremainder) {
            System.out.println("Got Some Remainder");
        }
    }
}
