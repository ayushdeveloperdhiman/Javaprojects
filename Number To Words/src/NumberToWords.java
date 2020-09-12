class NumberToWords {
    public static void main(String[] args) {
        numberToWords(254);
    }

    public static void numberToWords(int number) {
        int count=0;

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }else{
        int reverseNum = reverse(number);
        while (reverseNum != 0) {
                int lastDigit = reverseNum % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                }
                count++;
                reverseNum /= 10;
            }
        if(count!=getDigitCount(number)) {
            for (int i = getDigitCount(number); i != count; i--) {
                System.out.println("Zero");
            }
        }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10;
            reverse += digit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            while (number != 0) {
                count++;
                number /= 10;
            }
        }
        return count;
    }
}