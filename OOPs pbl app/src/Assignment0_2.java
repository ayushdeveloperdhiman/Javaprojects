  class Calculator{
    public static int powerInt(int num1,int num2){
        return (int) Math.pow(num1,num2);
    }

    public static double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }
  }

public class Assignment0_2 {
    public static void main(String[] args) {
        System.out.println(Calculator.powerInt(2,10));
        System.out.println(Calculator.powerDouble(5.4,5.25));
    }
}
