package laba5;

public class Cost {
    private double cost;

    public Cost(double cost) {
        this.cost = cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product) obj;
        if (this.getCost() > product.getCost().getCost()) {
            return true;
        } else {
            return false;
        }
    }

}
