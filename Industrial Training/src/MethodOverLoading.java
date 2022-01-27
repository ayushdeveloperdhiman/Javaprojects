public class MethodOverLoading {
    public static void main(String[] args) {
        area(25.1);
        area(20.45f);
        area(24.0,51.0);
        area(3.4f,25.01f);
    }
    static void area(double x){
        System.out.println("The area of square is "+Math.pow(x,2)+" sq.");
    }
    static void area(double x,double y){
        System.out.println("The area of rectangle is "+(x*y)+" sq.");
    }
    static void area(float x){
        System.out.println("The area of circle is "+Math.PI*x*x+" sq.");
    }
    static void area(float x,float y){
        System.out.println("The area of triangle is "+(x*y)/2+" sq.");
    }
}
