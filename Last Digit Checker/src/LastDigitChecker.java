public class LastDigitChecker {
    public static void main(String[]args){
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(9));
        System.out.println(isValid(10));
        System.out.println(isValid(55));
        System.out.println(isValid(1000));
        System.out.println(isValid(1001));


    }
    public static boolean hasSameLastDigit(int number1,int number2,int number3){
        if(number1>=10&&number2>=10&&number3>=10&&number1<=1000&&number2<=1000&&number3<=1000){
            if(number1%10==number2%10||number1%10==number3%10||number3%10==number2%10){
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int number){
        if(number>=10&&number<=1000){
            return true;
        }
        return false;
    }
}
