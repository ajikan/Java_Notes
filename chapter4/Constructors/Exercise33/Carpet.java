public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0d) {
            this.cost = 0;
        }
        else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
    
}
