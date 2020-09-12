package ayush;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        setCost(cost);
    }

    public void setCost(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}
