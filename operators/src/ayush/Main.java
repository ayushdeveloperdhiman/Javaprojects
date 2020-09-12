package ayush;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("Result = " + result);
        int previousResult = result;
        System.out.println("Privious Result = " + previousResult);
        result = result - 1;
        System.out.println("New Result = " + result);
        System.out.println("Previous Result = " + previousResult);
        result = result * 10;
        System.out.println("New Result After Multiplication By 2 = " + result);
        result = result / 5;
        System.out.println("New Result Divided By 5 = " + result);
        result = result % 3;
        System.out.println("Divided Result Reminder After Futher Dividing It By 3 = " + result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result -= 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 2;
        System.out.println(result);
        result %= 3;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It Is Not An Alien!");
            System.out.println("And I Am Scared Of Aliens");
        }

        int topScore = 79;
        if (topScore > 78) {
            System.out.println("You Got A New Top Score");
        }
        int secondTopScore = 78;
        if (topScore > secondTopScore && topScore <= 100) {
            System.out.println("Top Score Greater Than Second Top Score");
        }
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either Or Both Of The Conditions Are True");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("true");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This Is Not A Car");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("Was Car is True");
        }

    }
}
