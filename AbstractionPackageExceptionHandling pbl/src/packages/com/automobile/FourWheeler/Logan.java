package packages.com.automobile.FourWheeler;

import java.util.Scanner;

public class Logan extends packages.com.automobile.Vehicle {

    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Logan(String modelName,String registrationNumber,String ownerName,int speed){
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }
    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed(){
        return speed;
    }

    public int gps(){
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\tWelcome to the logan GPS navigation system.\n" +
                    "Enter 1 for turning on or 0 for turning of:");
            if(s.hasNextInt()){
                int input = s.nextInt();
                if(input == 1){
                    System.out.println("Turing GPS on...");
                    return 1;
                }else if(input == 0){
                    System.out.println("Shutting Down...");
                    return -1;
                }else {
                    System.out.println("Invalid input !!!");
                }
            }else {
                System.out.println("Invalid input !!!");
                s.next();
            }
        }
    }
}
