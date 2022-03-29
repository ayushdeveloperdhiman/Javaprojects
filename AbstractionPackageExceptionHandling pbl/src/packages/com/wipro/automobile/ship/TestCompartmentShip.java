package packages.com.wipro.automobile.ship;

public class TestCompartmentShip {
    public static void main(String[] args) {
        Compartment compartment = new Compartment(40.21,55,45.25);
        System.out.println("Height of compartment : "+compartment.getHeight());
        System.out.println("width of compartment : "+compartment.getWidth());
        System.out.println("breadth of compartment : "+compartment.getBreadth());
    }
}
