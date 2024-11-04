package laba5;

public class Dress extends Product {
    private String brand;

    public Dress(String title, String type, Cost cost, String brand) {
        super(title, type, cost);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    @Override
    public String toString() {
        return "Купи меня! " + "Я очень красивое " + super.title + " от " +  brand;
    }
}
