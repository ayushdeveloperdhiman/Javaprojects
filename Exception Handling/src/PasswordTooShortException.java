import java.util.Scanner;

public class PasswordTooShortException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = s.nextLine();
        System.out.println("Enter your password(Contains both alphabet and digits and must contain 6 characters)");
        String password = s.nextLine();
        try {
            if (password.length() < 6) {
                throw new Exception("Password too short");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int alphabetCount = 0;
        try {
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90 || password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                    alphabetCount++;
                }
            }
            if(alphabetCount==0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("No alphabet.");
        }
        int digitCount = 0;
        try {
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    digitCount++;
                }
            }
            if (digitCount == 0) {
                throw new Exception("No digit");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (digitCount != 0 && password.length() > 5 && alphabetCount != 0) {
            System.out.println("Correct");
            System.out.println("Your username " + userName);
            System.out.println("Your password " + password);
        }
    }
}