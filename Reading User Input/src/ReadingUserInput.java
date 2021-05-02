import java.util.Scanner;
public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter current year:");
            boolean currentYear = scanner.hasNextInt();
            int cy = 0,age=0;
            String name="";
            if (currentYear) {
                cy = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter your name:");
              name = scanner.nextLine();
                age = cy - birthYear;
            }else{
                System.out.println("Invalid current year.");
                System.exit(0);
            }
                if (age >= 0 && age <= 100) {
                    System.out.println("Your name is " + name + " ,and you are " + age + " years old.");
                } else {
                    System.out.println("Invalid year of birth.");
                }
            } else {
                System.out.println("unable to parse year of birth");
            }

        }
    }