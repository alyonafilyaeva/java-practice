package laba8;

public class ItemOfBasket<T> {
    // конкретный товар в корзине
    private final T item;
    // количество штук конкретного товара
    private int count;

    public ItemOfBasket(T item, int count) {
        this.item = item;
        this.count = count;
    }

    public T getItem() {
        return item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
