package ayush;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.theMonitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        theMonitor.drawPixelAt(1200, 50, "Yellow");
    }
}