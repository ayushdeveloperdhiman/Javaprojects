import java.util.Scanner;

public class RemoveSpecialCharactersFromString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = s.nextLine();
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i)>=33&&(int)str.charAt(i)<=47){
                continue;
            }else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
