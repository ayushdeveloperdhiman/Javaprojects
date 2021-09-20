import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two space separated string");
        String str=s.nextLine();
        String[] strArray=str.split(" ");
        System.out.println("Reversed String");
        for(int i= strArray.length-1;i>=0;i--){
            for(int j=0;j<strArray[i].length();j++){
                System.out.print(strArray[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
