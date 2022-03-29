package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment3 {
    public static void main(String[] args) {
        Vector<Integer> number = new Vector<>();
        number.add(10);
        number.add(15);
        number.add(41);
        number.add(75);
        number.add(47);

        System.out.println("Printing using Enumeration :");
        Enumeration<Integer> enumeration = number.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("Printing using Iterator :");
        Iterator<Integer> itr = number.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Printing using ListIterator");
        ListIterator<Integer> listIterator = number.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
