import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] arg) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=s.nextLine();
        char[] charArray = str.toCharArray();
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    System.out.print(charArray[i] + " ");
                    break;
                }
            }
        }
    }
}
