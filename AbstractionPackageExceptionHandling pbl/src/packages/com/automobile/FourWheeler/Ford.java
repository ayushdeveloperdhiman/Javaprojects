package packages.com.automobile.FourWheeler;

import java.util.Scanner;

public class Ford extends packages.com.automobile.Vehicle{
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    private int tempLevel = 0;

    public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
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

    public int getSpeed() {
        return speed;
    }

    public int tempControl(){

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter + and - to control temperature :");
            char ch = s.next().charAt(0);
            if(ch == '+'){
                tempLevel ++;
                System.out.println("Increasing temperature ...");
                return tempLevel;
            }else if(ch == '-'){
                tempLevel--;
                System.out.println("Decreasing temperature");
                return tempLevel;
            }else {
                System.out.println("Invalid input !!!");
            }
        }
    }

}
