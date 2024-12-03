package laba9;

public abstract class Clothes extends Product {

    private String color;

    public Clothes(String title, String type, Cost cost, String color) {
        super(title, type, cost);
        this.color = color;
    }

    public abstract String getWashingConditions(String type);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
