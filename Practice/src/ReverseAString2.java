import java.util.Scanner;

public class ReverseAString2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=s.nextLine();
        String[] strArray=str.split(" ");
        for(int i=0;i< strArray.length;i++){
            for(int j=strArray[i].length()-1;j>=0;j--){
                System.out.print(strArray[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
