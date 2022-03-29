package packages.com.automobile;

import packages.com.automobile.FourWheeler.Ford;
import packages.com.automobile.FourWheeler.Logan;
import packages.com.automobile.twowheeler.Hero;
import packages.com.automobile.twowheeler.Honda;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero Xtreme 160R","HP114121","Ayush Dhiman",150);
        Honda honda = new Honda("Honda Activa 6G","HH2563235","Ayush Dhiman",100);
        Logan logan = new Logan("Mahindra Renault Logan ","54515121","Ayush Dhiman",200);
        Ford ford = new Ford("Ford Endeavour","45451451","Ayush Dhiman",90);
        System.out.println(hero.getModelName());
        System.out.println(hero.getRegistrationNumber());
        System.out.println(hero.getOwnerName());
        hero.radio();

        System.out.println("________________________________");

        System.out.println(honda.getModelName());
        System.out.println(honda.getRegistrationNumber());
        System.out.println(honda.getOwnerName());
        honda.cdplayer();

        System.out.println("________________________________");

        logan.gps();
        ford.tempControl();

    }
}
