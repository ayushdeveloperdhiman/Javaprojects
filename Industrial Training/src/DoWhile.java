import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        boolean check=true;
        do{
            Scanner s=new Scanner(System.in);
            System.out.println("Enter number of operands you want :");
            int n=s.nextInt();
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                System.out.println("Enter "+(i+1)+"st element:");
                arr[i]=s.nextInt();
            }
            System.out.println("Select options :\n" +
                    "Enter 1 for addition.\n" +
                    "Enter 2 for subtraction.\n" +
                    "Enter 3 for multiplication.\n" +
                    "Enter 4 for division.\n" +
                    "Enter 5 for modulus.\n" +
                    "Enter 6 to exit.");
            int c=s.nextInt();
            double cal=0;
            switch (c){
                case 1:
                    for(int i=0;i< arr.length;i++){
                        cal+=arr[i];
                    }
                    System.out.println("The addition is: "+cal);
                    break;
                case 2:
                    cal=arr[0];
                    for(int i=1;i< arr.length;i++){
                        cal-=arr[i];
                    }
                    System.out.println("The subtraction is: "+cal);
                    break;
                case 3:
                    cal=1;
                    for(int i=0;i< arr.length;i++){
                        cal*=arr[i];
                    }
                    System.out.println("The multiplication is: "+cal);
                    break;
                case 4:
                    cal=arr[0];
                    for(int i=1;i< arr.length;i++){
                        try {
                            cal /= arr[i];
                            System.out.println("The division is: "+cal);
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }

                    break;
                case 5:
                    cal=arr[0];
                    for(int i=1;i< arr.length;i++){
                        try {
                            cal%=arr[i];
                            System.out.println("The modulus is: "+cal);
                        }catch (ArithmeticException e){
                            System.out.println(e.getMessage());
                        }

                    }

                    break;
                case 6:
                    check=false;
                    break;
                default:
                    System.out.println("You entered wrong input.");
            }
        }while (check);
    }
}
