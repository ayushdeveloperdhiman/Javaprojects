import java.util.Scanner;

public class UserPassword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = s.nextLine();
        System.out.println("Enter password");
        String password = s.nextLine();
        int count=0;

        try {
            if (password.length() < 6) {
                throw new Exception("Too short!");
            }
            for (int i = 0; i<password.length(); i++) {
                if(password.charAt(i)>=48&&password.charAt(i)<=57){
                    System.out.println("Password saved.");
                    break;
                }else {
                    throw new Exception("No digits.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
