public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog rocky = new Dog("Rocky", 52, 60, 2, 32, 1, 4, "Long silky");
        System.out.println(rocky.getBody());
     //   rocky.eat();
        rocky.run();
       // rocky.walk();
    }
}
