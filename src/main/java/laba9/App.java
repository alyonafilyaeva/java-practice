package laba9;

import java.util.*;

public class App {
    public static void main(String[] args)  {

        // в магазин привезли новую поставку обуви
        ArrayList<Shoes> delivery = new ArrayList<>(List.of(
                new Shoes("Туфли", "обувь", new Cost(3600), 37 ),
                new Shoes("Туфли", "обувь", new Cost(3600), 37 ),
                new Shoes("Туфли 1", "обувь", new Cost(3600), 38 ),
                new Shoes("Туфли 1", "обувь", new Cost(3600), 39 ),
                new Shoes("Туфли", "обувь", new Cost(3600), 37 ),
                new Shoes("Кроссовки", "обувь", new Cost(1200), 40),
                new Shoes("Кроссовки", "обувь", new Cost(1200), 41),
                new Shoes("Кроссовки", "обувь", new Cost(1200), 45),
                new Shoes("Тапочки", "обувь", new Cost(200), 36)
        ));

        // создадим HashMap, чтобы проверить сколько штук каждого товара нам пришло
        HashMap<String, Integer> map = new HashMap<>();

        for (Shoes shoes: delivery) {
            if (map.containsKey(shoes.title)) {
                map.put(shoes.title, map.get(shoes.title) + 1);
            } else {
                map.put(shoes.title, 1);
            }
        }

        System.out.println(map.entrySet());

        // если рассматриваем кейс, где List - это поставка обуви, то подойдет ArrayList,
        // потому что товар приходит за раз, без добавления и удаления элементов

        // если рассматриваем кейс, где List - это корзина покупателя, то лучше будет LinkedList,
        // так как происходит частое добавление элементов в корзину, и удаление,
        // но опять же таки удаление происходит из любого места, поэтому для LinkedList
        // это может стать затруднительным при больших объемах,
        // но в рамках корзины товаров у пользователя не будет 100000 штук,
        // поэтому можно смело использовать LinkedList
    }
}
