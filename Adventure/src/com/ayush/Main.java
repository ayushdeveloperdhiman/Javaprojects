package com.ayush;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> temp=new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",temp));
        temp=new HashMap<>();
        temp.put("W",2);
        temp.put("E",3);
        temp.put("S",4);
        temp.put("N",5);
        locations.put(1,new Location(1,"You are standing at the end of a road before a small brick building",temp));
        //tem.put("Q",0);
        temp=new HashMap<>();
        temp.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",temp));

        //tem.put("Q",0);
        temp=new HashMap<>();
        temp.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",temp));

        //tem.put("Q",0);
        temp=new HashMap<>();
        temp.put("N",1);
        temp.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",temp));

        //tem.put("Q",0);
        temp=new HashMap<>();
        temp.put("S",1);
        temp.put("W",2);
        locations.put(5, new Location(5, "You are in the forest", temp));

        //tem.put("Q",0);
        Map<String,String> vocabulary=new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");
        vocabulary.put("SOUTH","S");

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }
            Map<String,Integer> exits=locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit: exits.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();
            String direction=scanner.nextLine().toUpperCase();
            if(direction.length()>1){
                String[] words=direction.split(" ");
                for(String word:words){
                    if(vocabulary.containsKey(word)){
                        direction=vocabulary.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else{
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
