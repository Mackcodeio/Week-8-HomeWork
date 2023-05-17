package homework.carprt_17;

public class Carprt {
    double cost;

    public Carprt(double cost) {
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
