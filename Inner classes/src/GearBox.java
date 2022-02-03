import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear=0;
    private boolean clutchIn;
    public GearBox(int maxGears){
        this.maxGears=maxGears;
        gears=new ArrayList<Gear>();
        Gear neutral=new Gear(0,0.0);
        this.gears.add(neutral);
        for(int i=0;i<maxGears;i++){
            addGear(i,i*5.3);
        }
    }
    public void operateClutch(boolean in){
        this.clutchIn=in;
    }
    public void addGear(int number,double ratio){
        if(number>0 && number<=maxGears){
            this.gears.add(new Gear(number,ratio));
        }
    }
    public void changeGear(int number){
        if(number>0 && number<this.gears.size() && clutchIn){
            this.currentGear=number;
            System.out.println("Gear "+number+" selected.");
        }else{
            System.out.println("Grind!");
            this.currentGear=0;
        }
    }
    public double wheelSpeed(int rev){
        if(clutchIn){
            System.out.print("Scream!!\nclutch is in\nSpeed :");
            return 0.0;
        }
        System.out.print("Speed :");
        return gears.get(currentGear).getRatio()*rev;
    }
    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber,double ratio){
            this.gearNumber=gearNumber;
            this.ratio=ratio;
           // GearBox.this.currentGear=0; this is the way to access the outer class variables
            
        }
        public double driveSpeed(int rev){
            return rev*(this.ratio);
        }
        public double getRatio(){
            return this.ratio;
        }
    }
}
