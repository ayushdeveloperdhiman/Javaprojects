import java.util.Scanner;
public class MinimumAndMaximumChallenge {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int max=0;
        int min=0;
        boolean flag=true;
        while(true){
            System.out.println("Enter Number :");
            boolean a=scanner.hasNextInt();
            if(a){
                int number=scanner.nextInt();
                if(flag){
                    flag=false;
                    min=number;
                }
                if(number>max){
                    max=number;
                }
                if(number<min){
                    min=number;
                }

            }else{
             break;
            }
        }
        System.out.println("Maximum number is "+max+" minimum number is "+min);
    }
}
