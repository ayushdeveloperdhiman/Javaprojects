import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String firstName=s.nextLine();
        System.out.println("Your firstName in uppercase: "+firstName.toUpperCase());
        System.out.println("Your firstName in lowercase: "+firstName.toLowerCase());
        System.out.println("First character of you firstName: "+firstName.charAt(0));
        System.out.println("Enter your last firstName: ");
        String fullName =firstName.concat(" "+s.nextLine());
        System.out.println("Your full Name: "+fullName);
        String[] arr=fullName.split(" ");
        System.out.println("Short name for you: "+firstName.toUpperCase().charAt(0)+". "+arr[arr.length-1]);
    }
}
