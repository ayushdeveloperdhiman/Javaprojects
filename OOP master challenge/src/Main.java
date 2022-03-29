import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hamburger burger=getBurger();
        burger.additional();
    }
    public static Hamburger getBurger(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Press 1 for Basic Hamburger\nPress 2 for Healthy Burger\nPress 3 for Deluxe Burger");
        int n=scanner.nextInt();
        switch (n){
            case 1:
                return new Hamburger("OatGrain","Ham",5,"Basic Hamburger");
            case 2:
                return new HealthyBurger();
            case 3:
                return new DeluxeHamburger();
        }
        return null;
    }
}
