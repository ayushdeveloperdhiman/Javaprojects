import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {
//djkasdjha
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward=true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities to visit.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            boolean a = scanner.hasNextInt();
            if (a) {
                int action = scanner.nextInt();
                switch (action) {
                    case 0:
                        System.out.println("Holiday(Vacation) over");
                        quit = true;
                        break;
                    case 1:
                        if(!goingForward){
                            if(listIterator.hasNext()){
                                listIterator.next();
                            }
                            goingForward=true;
                        }
                        if (listIterator.hasNext()) {
                            System.out.println("Now visiting " +listIterator.next());
                        }else{
                            System.out.println("Already at the last city.");
                            goingForward=false;
                        }
                        break;
                    case 2:
                        if(goingForward){
                            if(listIterator.hasPrevious()){
                                listIterator.previous();
                            }
                            goingForward=false;
                        }
                        if (listIterator.hasPrevious()){
                            System.out.println("Now visiting "+listIterator.previous());
                        }else{
                            System.out.println("You are at the starting city.");
                            goingForward=true;
                        }
                        break;
                    default:
                        System.out.println("Invalid Option Exiting.");
                }
            }else{
                System.out.println("Invalid Option");
                printMenu();
                scanner.next();
            }
        }
    }
    private static void printMenu(){
        System.out.println("=============\n" +
                "Press 0 to Quit.\n" +
                           "Press 1 to visit next city.\n" +
                           "Press 2 to visit previous city.");
    }
}
