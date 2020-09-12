package ayush;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPagesPrinted =0;
        this.duplex = duplex;
    }

    public int fillUp(int fill) {
        if (fill > 0 && fill <= 100) {
            if (this.tonerLevel + fill <= 100) {
                this.tonerLevel += fill;
                return this.tonerLevel;
            } else {
                return -1;
            }
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint=pages;
        if (this.duplex){
            pagesToPrint=(pages/2)+(pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
