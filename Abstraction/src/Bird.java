public abstract class Bird extends Animal implements CanFly{
    public Bird(String name){
        super(name);
    }
    public void eat(){
        System.out.println(getName()+" is pecking.");
    }
    public void breathe(){
        System.out.println("Breathe in,Breathe out,repeat");
    }
    public void fly(){
        System.out.println(getName()+" is flapping its wings");
    }
}
