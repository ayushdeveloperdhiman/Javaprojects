package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ayush Dhiman");
        names.add("Shivani");
        names.add("Aditya");
        names.add("Ashish");
        names.add("Ayush Tyagi");
        names.add("Suraj");
        printAll(names);
    }
    public static void printAll(ArrayList<String> str){
        Iterator<String> itr = str.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
