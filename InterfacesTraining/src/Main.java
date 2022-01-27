import java.util.Scanner;

public class Main implements Interface1,Interface2,Interface3,Interface4,Interface5{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter three values: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        Main ob= new Main();
        System.out.println("Addition of "+a+" and "+b+" is "+ob.addTwoValues(a,b));
        System.out.println("Addition of "+a+", "+b+" and "+c+" is "+ob.addThreeValues(a,b,c));
        System.out.println("Subtraction of "+a+" and "+b+" is "+ob.subtractTwoValues(a,b));
        System.out.println("Subtraction of "+a+", "+b+" and "+c+" is "+ob.subtractThreeValues(a,b,c));
        System.out.println("Multiplication of "+a+" and "+b+" is "+ob.multiplyTwoValues(a,b));
        System.out.println("Multiplication of "+a+", "+b+" and "+c+" is "+ob.multiplyThreeValues(a,b,c));
        System.out.println("Division of "+a+" and "+b+" is "+ob.divideTwoValues(a,b));
        System.out.println("Division of "+a+", "+b+" and "+c+" is "+ob.divideThreeValues(a,b,c));
        System.out.println("Modulus of "+a+" and "+b+" is "+ob.modulusOfTwoValues(a,b));
        System.out.println("Modulus of "+a+", "+b+" and "+c+" is "+ob.modulusOfThreeValues(a,b,c));
        System.out.println("Enter one more value: ");
        int d=s.nextInt();
        System.out.println("Addition of "+a+", "+b+", "+c+" and "+"is "+ob.addFourValues(a,b,c,d));
        System.out.println("Subtraction of "+a+", "+b+", "+c+" and "+"is "+ob.subtractFourValues(a,b,c,d));

    }

    @Override
    public int addTwoValues(int a, int b) {
        return a+b;
    }

    @Override
    public int addThreeValues(int a, int b, int c) {
        return a+b+c;
    }

    @Override
    public int subtractTwoValues(int a, int b) {
        return a-b;
    }

    @Override
    public int subtractThreeValues(int a, int b, int c) {
        return a-b-c;
    }

    @Override
    public int multiplyTwoValues(int a, int b) {
        return a*b;
    }

    @Override
    public int multiplyThreeValues(int a, int b, int c) {
        return a*b*c;
    }

    @Override
    public double divideTwoValues(double a, double b) {
        return a/b;
    }

    @Override
    public double divideThreeValues(double a, double b, double c) {
        return a/b/c;
    }

    @Override
    public int modulusOfTwoValues(int a, int b) {
        return a%b;
    }

    @Override
    public int modulusOfThreeValues(int a, int b, int c) {
        return a%b%c;
    }

    public int addFourValues(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public int subtractFourValues(int a,int b,int c,int d){
        return a-b-c-d;
    }
}
