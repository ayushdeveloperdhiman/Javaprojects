public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(15257));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastdigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return (number + lastdigit);
    }
}
