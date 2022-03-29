class DeluxeHamburger extends Hamburger {
    private double price = getPrice();

    public DeluxeHamburger() {
        super("Sliced bread", "Bacon", 20, "Deluxe Hamburger");
        System.out.println("Burger price = " + getPrice());
    }

    public void additional() {
        System.out.println("Your " + getName() + " with chips and drinks is for = " + getPrice() + " dollars.");
    }
}
