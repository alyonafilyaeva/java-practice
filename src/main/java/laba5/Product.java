package laba5;

public class Product {
    protected String title;
    protected String type;

    protected Cost cost;

    public Product(String title, String type, Cost cost) {
        this.title = title;
        this.type = type;
        this.cost = cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Cost getCost() {
        return this.cost;
    }
    @Override
    public String toString() {
        return "Купи меня!";
    }

}
