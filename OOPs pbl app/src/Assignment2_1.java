class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
    public void sleep(){
        System.out.println("Animal is sleeping...");
    }
}

class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("Bird is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping...");
    }

    public void fly(){
        System.out.println("Bird is flying...");
    }
}


public class Assignment2_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println("----------------------------");
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
        bird.sleep();
    }
}
