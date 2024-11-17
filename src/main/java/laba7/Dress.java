package laba7;

public class Dress extends Clothes implements Available{
    private String brand;

    public Dress(String title, String type, Cost cost, String brand, String color) {
        super(title, type, cost, color);
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

    @Override
    public String getWashingConditions(String type) {
        return null;
    }

    @Override
    public boolean isAvailable(String title) {
        return false;
    }

}
