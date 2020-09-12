public class EqualSumChecker {

    public static void main(String[]args){
      boolean result=  hasEqualSum(5,5,10);
      System.out.println(result);
    }
    public static boolean  hasEqualSum(int num1,int num2,int num3){
        if((num1+num2)==num3){
            return true;
        }
            return false;
    }
}