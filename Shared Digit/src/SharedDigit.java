public class SharedDigit {
    public static void main(String[]args){
        System.out.println(hasSharedDigit(5,55));

    }
    public static boolean hasSharedDigit(int firstNumber,int secondNumber) {

        if (firstNumber >= 10 && firstNumber <= 99 && secondNumber >= 10 && secondNumber <= 99) {
            if (firstNumber % 10 == secondNumber % 10 || firstNumber % 10 == secondNumber / 10 || firstNumber / 10 == secondNumber / 10) {
                return true;
            }
        }
        return false;
    }
}
