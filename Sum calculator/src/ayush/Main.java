package ayush;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(20.0);
        calculator.setSecondNumber(0);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getDivisionResult());
    }
}
