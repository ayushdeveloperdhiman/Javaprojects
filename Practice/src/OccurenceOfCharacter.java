import java.util.Arrays;
import java.util.Scanner;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = s.nextLine();
        str=str.replaceAll(" ","");
        char[] ch=new char[str.length()];
        for(int i=0;i< ch.length;i++){
            ch[i]=str.charAt(i);
        }
        Arrays.sort(ch);
        int temp=0;
        for(int i=0;i<str.length();i=temp){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            System.out.println(ch[i]+" comes "+count);
            temp+=count;
        }
    }
}
