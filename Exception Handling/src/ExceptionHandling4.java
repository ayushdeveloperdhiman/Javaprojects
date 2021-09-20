import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandling4 {
    public static void main(String[] args)throws Exception{
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter a String: ");
        String str=br.readLine();
        System.out.println("Your name is: "+str);
        System.out.println("To calculate your age enter your birth year: ");
        int birthYear=Integer.parseInt(br.readLine());
        System.out.println("Enter current year: ");
        int currentYear=Integer.parseInt(br.readLine());
        System.out.print("Your age is: "+(currentYear-birthYear));
    }
}
