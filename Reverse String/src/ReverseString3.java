import java.util.Scanner;

public class ReverseString3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] ch= s1.toCharArray();
        String rev="";
        for(int i=s1.length()-1;i>=0;i--){
            rev+=ch[i];
        }
        System.out.println(rev);
    }
}
