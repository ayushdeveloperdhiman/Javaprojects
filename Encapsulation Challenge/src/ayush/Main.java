package ayush;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = "+printer.getNumberOfPagesPrinted());
        int pagePrinted=printer.printPages(5);
        System.out.println("Pages printed was = "+pagePrinted+" total pages printed = "+printer.getNumberOfPagesPrinted());
        pagePrinted=printer.printPages(10);
        System.out.println("Pages printed was = "+pagePrinted+" total pages printed = "+printer.getNumberOfPagesPrinted());

    }
}
