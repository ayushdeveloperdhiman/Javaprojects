public class Mian {
    public static void main(String[] args) {
     Car car=new Car(8,"Base car");
        System.out.println(car.startEngine());
        Mitsubishi mitsubishi=new Mitsubishi(5,"jhasdghjksdf");
        System.out.println(mitsubishi.startEngine());
        System.out.println(Mian.class.getSimpleName());
    }
}
