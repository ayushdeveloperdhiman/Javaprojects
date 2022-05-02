 class Birds extends Flyers{
    void fly(){
        System.out.println("Birds ");
    }
 }

public abstract class Flyers {
    private void fly(){
        System.out.printf("Fly");
    }

    public static void main(String[] args) {
        Flyers birds = new Birds();
        birds.fly();
    }
}
