package com.ayush;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a number for a day");
            Scanner sc = new Scanner(System.in);
            boolean b = sc.hasNextInt();
            if (b) {
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Invalid value");
                }
                break;
            }else{
                System.out.println("Invalid Value.");
            }
        }
    }
}
