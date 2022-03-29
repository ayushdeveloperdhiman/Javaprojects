package exception_handling;
import java.util.Scanner;

class NegativeValues extends Exception {
    public String getMessage() {
        return "NegativeValuesException occurred";
    }
}

class ValuesOutOfRange extends Exception {
    public String getMessage() {
        return "ValuesOutOfRangeException occurred for range 0 to 100";
    }
}

public class Question3 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String name;
            int sub1, sub2, sub3;
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter the name of student :");
                name = s.nextLine();
                while (true) {
                    System.out.println("Enter marks for 1st subject :");
                    try{
                        sub1 =Integer.parseInt(s.nextLine());

                        if(sub1 < 0){
                            System.out.println("Invalid input !!!");
                            throw new NegativeValues();
                        }else if(sub1 > 100){
                            System.out.println("Invalid input !!!");
                            throw new ValuesOutOfRange();
                        }else {
                            break;
                        }
                    }catch (NegativeValues | ValuesOutOfRange | NumberFormatException e){
                        System.out.println(e.getClass());
                    }

                }
                while (true) {
                    System.out.println("Enter marks for 2nd subject :");
                    try{
                        sub2 =Integer.parseInt(s.nextLine());

                        if(sub2 < 0){
                            System.out.println("Invalid input !!!");
                            throw new NegativeValues();
                        }else if(sub2 > 100){
                            System.out.println("Invalid input !!!");
                            throw new ValuesOutOfRange();
                        }else {
                            break;
                        }
                    }catch (NegativeValues | ValuesOutOfRange | NumberFormatException e){
                        System.out.println(e.getClass());
                    }

                }
                while (true) {
                    System.out.println("Enter marks for 3rd subject :");
                    try{
                        sub3 =Integer.parseInt(s.nextLine());

                        if(sub3 < 0){
                            System.out.println("Invalid input !!!");
                            throw new NegativeValues();
                        }else if(sub3 > 100){
                            System.out.println("Invalid input !!!");
                            throw new ValuesOutOfRange();
                        }else {
                            break;
                        }
                    }catch (NegativeValues | ValuesOutOfRange | NumberFormatException e){
                        System.out.println(e.getClass());
                    }

                }
                System.out.println("Name : "+name);
                System.out.println("Average : "+(double)(sub1+sub2+sub3)/3 );
            }

    }
}