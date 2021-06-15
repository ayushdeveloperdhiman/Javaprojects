package com.ayush;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Olympian", 8, 12);
        List<Theater.Seat> seatCopy=new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if(theater.reserveSeat("A02")){
            System.out.println("Pay");
        }else{
            System.out.println("Seat already reserved");
        }
        Collections.shuffle(seatCopy);
        System.out.println("Printing seat copy ");
        printList(seatCopy);
        System.out.println("Printing Theater.seats");
        printList(theater.seats);
        Theater.Seat maxSeat=Collections.max(seatCopy);
        Theater.Seat minSeat=Collections.min(seatCopy);
        System.out.println("Max seat "+maxSeat.getSeatNumber());
        System.out.println("Min seat "+minSeat.getSeatNumber());
        sortList(seatCopy);
        System.out.println("Sorted seat copy:");
        printList(seatCopy);
    /*  theater.getSeat();
        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }*/

    }
    public static void printList(List<Theater.Seat> list){
        for(Theater.Seat seat:list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("========================================================================");
    }
    public static void sortList(List<? extends Theater.Seat> list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}
