import java.util.Scanner;

    class Main{
    public static void main(String[]args){
        System.out.println("Sum of two numbers.");
        Scanner sc=new Scanner(System.in);
        int x=0,y=0;
        boolean loop=true;
        while(loop) {
            System.out.println("Enter first number :\r");
            boolean a = sc.hasNextInt();
            if (a) {
                int num1 = sc.nextInt();
                x = num1;
                while (loop){
                    sc.nextLine();
                    System.out.println("Enter second number :\r");
                    boolean b=sc.hasNextInt();
                    if(b) {
                        int num2 = sc.nextInt();
                        y=num2;
                        loop=false;
                    }else{
                        System.out.println("invalid value.");
                    }
                }
            } else {
                System.out.println("Invalid Value.");
            }
            sc.nextLine();
        }
        System.out.println("sum :"+(x+y));
    }
}
