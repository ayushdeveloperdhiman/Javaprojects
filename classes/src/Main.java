public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        holden.setModel("Commadore");
        System.out.println("Porsche model is "+porsche.getModel());
        System.out.println("Holden model is "+holden.getModel());
    }
}
