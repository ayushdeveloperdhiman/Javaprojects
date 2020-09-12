package ayush;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name,String size){
        this.name=name;
        this.size=size;
        this.currentVelocity=0;
        this.currentDirection=0;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection+" degrees.");
    }
    public void move(int velocity,int direction){
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("Vehicle.move(): Moving at velocity "+currentVelocity+"km/h towards "+currentDirection+" degrees.");
    }
    public void stop(){
        this.currentVelocity=0;
        System.out.println("Vehicle stopped");
    }
    public int getCurrentVelocity(){
        return currentVelocity;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }


}
