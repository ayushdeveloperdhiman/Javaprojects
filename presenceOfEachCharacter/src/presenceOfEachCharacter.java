import java.util.Scanner;

public class presenceOfEachCharacter {
    static void countChar(String s) {
        int count[] = new int[1000];
        int l = s.length();
        for (int i = 0; i < l; i++)
            count[s.charAt(i)]++;
        char array[] = new char[s.length()];
        for (int i = 0; i < l; i++) {
            array[i] = s.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Presence of char " + s.charAt(i)
                        + " in " + s + " is:" + count[s.charAt(i)]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a string\r");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        countChar(string);
    }
}

