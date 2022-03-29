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
