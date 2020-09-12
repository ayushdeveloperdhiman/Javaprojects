public class TeenNumberChecker {
    public static void main(String[] args) {

        boolean result=isTeen(11);
        System.out.println(hasTeen(0,10,19));
        System.out.println(result);

    }


    public static boolean hasTeen(int num1,int num2,int num3){
        if(num1>=13&&num1<=19||num2>=13&&num2<=19||num3>=13&&num3<=19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num){
        if(num>=13 && num<=19){
            return true;
        }
        return false;
    }
}