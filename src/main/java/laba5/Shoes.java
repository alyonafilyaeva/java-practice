package laba5;

public class Shoes extends Product {
    private int size;

    public Shoes(String title, String type, Cost cost, int size) {
        super(title, type, cost);
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Купи нас! " + "Мы очень удобные " + super.title + " " + size + " pазмера";
    }
}
