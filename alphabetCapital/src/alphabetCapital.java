import java.util.Scanner;

public class alphabetCapital {
    public static void main(String[]args){
        System.out.println("Enter a string:\r");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        Scanner b=new Scanner(a);
        while(b.hasNext()){
            String c=b.next();
            System.out.print(Character.toUpperCase(c.charAt(0))+c.substring(1)+" ");
        }
    }
}
