import java.util.Scanner;

class Hamburger {
    private String rollType, meat, name;
    private String lettuce, carrot, tomato, onion;
    private double price;

    public Hamburger(String rollType, String meat, double price, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void additional() {
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        int count = 0;
        while (c != 1) {
            System.out.println("Burger price = " + getPrice());
            System.out.println("Type 'true' if you want lettuce for 5 dollars else type 'false'. ");
            this.lettuce = scanner.nextLine();
            if (this.lettuce.toLowerCase().equals("true")) {
                this.price += 5;
                System.out.println("Lettuce added");
                c++;
                count++;
            } else if (this.lettuce.toLowerCase().equals("false")) {
                c++;
            } else {
                System.out.println("Invalid");
            }
        }
        c = 0;
        while (c != 1) {
            System.out.println("Type 'true' if you want carrot for 5 dollars else type 'false'. ");
            this.carrot = scanner.nextLine();
            if (this.carrot.toLowerCase().equals("true")) {
                this.price += 5;
                System.out.println("Carrot added.");
                c++;
                count++;
            } else if (this.carrot.toLowerCase().equals("false")) {
                c++;
            } else {
                System.out.println("Invalid");
            }
        }
        c = 0;
        while (c != 1) {
            System.out.println("Type 'true' if you want tomato for 5 dollars else type 'false'. ");
            this.tomato = scanner.nextLine();
            if (this.tomato.toLowerCase().equals("true")) {
                this.price += 5;
                System.out.println("Tomato added.");
                c++;
                count++;
            } else if (this.tomato.toLowerCase().equals("false")) {
                c++;
            } else {
                System.out.println("Invalid");
            }
        }
        c = 0;
        while (c != 1) {
            System.out.println("Type 'true' if you want onion for 5 dollars else type 'false'. ");
            this.onion = scanner.nextLine();
            if (this.onion.toLowerCase().equals("true")) {
                this.price += 5;
                System.out.println("Onion added.");
                c++;
                count++;
            } else if (this.onion.toLowerCase().equals("false")) {
                c++;
            } else {
                System.out.println("Invalid");
            }
        }
        System.out.println("Your " + name + " with " + count + " additions is for = " + this.price + " dollars.");
    }
}

class HealthyBurger extends Hamburger {
    private String avocado, cucumber;
    double price = getPrice();

    public HealthyBurger() {
        super("Brown-Rye-Bread roll", "Bacon", 25, "HealthyBurger");
    }

    public void additional() {
        System.out.println("Your healthy burger include tomato,carrot,lettuce and onion each for 5 dollars.");
        System.out.println("Burger price = " + this.price);
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        while (c != 1) {
            System.out.println("Type 'true' if you want avocado for 5 dollars else type 'false'.");
            this.avocado = scanner.nextLine();
            if (this.avocado.toLowerCase().equals("true")) {
                this.price += 5;
                System.out.println("Avocado added.");
                c++;
            } else if (this.avocado.toLowerCase().equals("false")) {
                c++;
            } else {
                System.out.println("Invalid");
            }
        }
        c = 0;
        while (c != 1) {
            System.out.println("Type 'true' if you want cucumber for 5 dollars else type 'false'.");
            this.cucumber = scanner.nextLine();
            if (this.cucumber.toLowerCase().equals("true")) {
                this.price += 5;
                System.out.println("Cucumber added.");
                c++;
            } else if (this.cucumber.toLowerCase().equals("false")) {
                c++;
            } else {
                System.out.println("Invalid");
            }
        }
        System.out.println(this.price);
    }
}

class DeluxeHamburger extends Hamburger {
    private double price = getPrice();

    public DeluxeHamburger() {
        super("Sliced bread", "Bacon", 20, "Deluxe Hamburger");
        System.out.println("Burger price = "+getPrice());
    }
    public void additional(){
        System.out.println("Your "+getName()+" with chips and drinks is for = "+getPrice()+" dollars.");
    }
}

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
