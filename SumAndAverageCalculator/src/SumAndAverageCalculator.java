import java.util.Scanner;

public class SumAndAverageCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            boolean a = scanner.hasNextInt();
            if (a) {
                int number = scanner.nextInt();
                sum+=number;
                count++;
            }else{
                scanner.close();
                break;
            }
            scanner.nextLine();
        }
        long avg= Math.round((double)(sum)/count);
        System.out.println("SUM = "+sum+" AVG = "+Math.round(avg));

    }
}
