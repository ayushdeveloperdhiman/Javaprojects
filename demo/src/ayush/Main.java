package ayush;

class Car {
    private String brand;

    public Car() {
        this.brand = "Ford";
    }

    public String getBrand() {
        return brand;
    }
}

public class Main extends Car {

    public static void main(String[] args) {
        Car car=new Car();
        String brand =car.getBrand();
        System.out.println(brand);
    }
}
