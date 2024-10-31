package laba4.task2;

public class Sale {
    private double delivery;
    private double sale5;
    private double sale10;
    private double sale15;

    public Sale(double delivery, double sale5, double sale10, double sale15) {
        this.delivery = delivery;
        this.sale5 = sale5;
        this.sale10 = sale10;
        this.sale15 = sale15;
    }

    public double getDelivery() {
        return delivery;
    }
    public void setDelivery(int x) {
        this.delivery = delivery;
    }

    public double getSale5() {
        return sale5;
    }
    public void setSale5(int x) {
        this.sale5 = sale5;
    }

    public double getSale10() {
        return sale10;
    }
    public void setSale10(int x) {
        this.sale10 = sale10;
    }

    public double getSale15() {
        return sale15;
    }
    public void setSale15(int x) {
        this.sale15 = sale15;
    }

    public double applyDelivery(double sum) {return sum + this.delivery;}

    public double applySale(double sum, int sale) {
        switch (sale) {
            case 5 -> {
                return sum - sum * this.getSale5();
            }
            case 10 -> {
                return sum - sum * this.getSale10();
            }
            case 15 -> {
                return sum - sum * this.getSale15();
            }
            default -> {
                return sum;
            }
        }
    }
}
