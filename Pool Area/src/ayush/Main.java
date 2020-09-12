package ayush;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.25, 10.85);
        System.out.println("rectangle.width ="+rectangle.getWidth());
        System.out.println("rectangle.length ="+rectangle.getLength());
        System.out.println("rectangle.area ="+rectangle.getArea());
        Cuboid cuboid = new Cuboid(4.25,5.27,8.24);
        System.out.println("cuboid.width ="+cuboid.getWidth());
        System.out.println("cuboid.length ="+cuboid.getLength());
        System.out.println("cuboid.height ="+cuboid.getHeight());
        System.out.println("cuboid.volume ="+cuboid.getVolume());
    }
}
