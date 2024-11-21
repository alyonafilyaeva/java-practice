package laba8;

import java.util.ArrayList;

public class Basket<T> {
    // товары в корзине
    private ArrayList<ItemOfBasket<T>> data;
    // количество товаров в корзине
    private int size;

    public Basket() {
        data = new ArrayList<>();
        size = 0;
    }

    // добавить товар в корзину
    public void addItem(T product, int count) {
        for(int i = 0; i < count; i++) {
            data.add(new ItemOfBasket<>(product, size++));
        }

    }

    public int getIndex(T product) {
        /* когда кладем в корзину 2 одинаковых товара, считаем, что они идентичны,
        поэтому при удалении нам не важно, какие именно убрать,
        поэтому убираем первые в списке
         */

        // находим индекс нужного товара
        for (int i = 0; i < data.size(); i++)
        {
            ItemOfBasket<T> auction = data.get(i);
            if (product.equals(auction.getItem()))
            {
                return i;
            }
        }

        return -1;
    }

    // удалить товар, если он есть в корзине
    public void removeItem(T product) {

        int index = getIndex(product);
        if (index != -1) {
            data.remove(index);
            size--;
        }

    }
    public T getData() {
        return (T) data;
    }

    public void watchData() {
        for (ItemOfBasket<T> item : data) {
            System.out.println(item.getItem());
        }
    }

    public int getSize() {
        return size;
    }

}
