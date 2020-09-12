public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;
        int isPrime = 0;
        int temp = number;

        while (temp > 0) {
            for (int i = 1; i < temp; i++) {

                if (temp % i == 0) {
                    isPrime++;
                }

                if (isPrime == 1 && number % temp == 0) {

                    return temp;
                }
                temp--;
                isPrime = 0;
            }

        }
        return -1;
    }
}