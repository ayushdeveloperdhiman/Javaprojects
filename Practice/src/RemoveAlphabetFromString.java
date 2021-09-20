import java.util.Scanner;

public class RemoveAlphabetFromString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        System.out.println("Alphabets removed :");
        String result="";
        for(int i=0;i<str.length();i++){
            if(((int)str.charAt(i)>=65&&(int)str.charAt(i)<=90)||((int)str.charAt(i)>=97&&(int)str.charAt(i)<=122)){
                continue;
            }else{
                result+=str.charAt(i);
            }

        }
        System.out.println(result);
    }
}
