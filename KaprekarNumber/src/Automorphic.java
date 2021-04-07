import java.util.Scanner;

public class Automorphic {
    static boolean isAutomorphic(int num)
    {
        int square = num * num;
        while (num > 0)
        {
            if (num % 10 != square % 10)
                return false;
            num = num/10;
            square = square/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(isAutomorphic(num)){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not automorphic");
        }
    }
}
