package ayush;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue=Float.MIN_VALUE;
	float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("My Maximum Float Value = "+myMaxFloatValue);
        System.out.println("My Minimum Float Value = "+myMinFloatValue);

        double myMinDoubleValue=Double.MIN_VALUE;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("My Maximum Double Value = "+myMaxDoubleValue);
        System.out.println("My Minimum Double Value = "+myMinDoubleValue);

        float a=5f/3f;
        double b=5.0/3.0;
        int c=5/3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double kilograms=49d;
        double pounds=kilograms/0.45359237d;

        System.out.println(pounds);
    }
}
