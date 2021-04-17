import java.util.Scanner;

public class ValidEmailAddress {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter email :");
        String str = s.nextLine();
        int count = 0;
        try {
            for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '@') {
                        count++;
                        break;
                    }
            }
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == '.') {
                    count++;
                    break;
                }
            }
            if (count < 2) {
                throw new Exception("invalid");
            }
            System.out.println("valid.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
