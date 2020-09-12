public class Dog extends Animal{
    private int eyes;
    private int teeth;
    private int tail;
    private int legs;
    private String coat;
    public Dog(String name,int size,int weight,int eyes,int teeth,int tail,int legs,String coat){
        super(name,1,1,size,weight);
        this.eyes=eyes;
        this.teeth=teeth;
        this.tail=tail;
        this.legs=legs;
        this.coat=coat;
    }
    protected void chew(){
        System.out.println("Dog.chew called");
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }
private void moveLegs(int speed){
    System.out.println("Dog.moveLegs called");
}
    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed);
    }

    public void walk(){
        System.out.println("Dog.walk called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run called");
        move(10);
    }

}
