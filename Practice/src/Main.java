import java.util.Scanner;

public class Main {
    public static int FirstFactorial(int num){

        if(num==0||num==1){
            return 1;
        }
        num*=FirstFactorial(num-1);
        return num;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
