import java.util.Scanner;

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
