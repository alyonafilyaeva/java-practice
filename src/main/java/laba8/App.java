package laba8;

import java.util.Arrays;

public class App {
    static Shoes shoes = new Shoes("Туфли", "обувь", new Cost(3600), 37 );
    static Shoes sneakers = new Shoes("Кроссовки", "обувь", new Cost(1200), 40);
    static Shoes slippers = new Shoes("Тапочки", "обувь", new Cost(200), 36);
    static Dress mini = new Dress("Платье длиной мини", "платье",new Cost(2700), "Gucci", "pink");
    static Dress maxi = new Dress("Платье длиной макси", "платье", new Cost(4200), "Zara", "black");

    public static void main(String[] args) throws CloneNotSupportedException {

        // магазин обуви
        System.out.println("Мы зашли в магазин и взяли корзину");
        Basket<Shoes> ShoesBasket = new Basket<>();
        System.out.println(ShoesBasket.getData());

        System.out.println("\nПоложили в нее две пары туфель и кроссовки");
        ShoesBasket.addItem(sneakers, 1);
        ShoesBasket.addItem(shoes, 2);
        System.out.println("В корзине " + ShoesBasket.getSize() + " товара:");
        ShoesBasket.watchData();

        System.out.println("\nПередумали брать туфли");
        ShoesBasket.removeItem(shoes);
        System.out.println("В корзине " + ShoesBasket.getSize() + " товара:");
        ShoesBasket.watchData();

        System.out.println("\nРешили взять лучше тапочки");
        ShoesBasket.addItem(slippers, 2);
        System.out.println("В корзине " + ShoesBasket.getSize() + " товара:");
        ShoesBasket.watchData();

        System.out.println("=================================================");
        // магазин платьев
        System.out.println("Мы зашли в магазин и взяли корзину");
        Basket<Dress> DressBasket = new Basket<>();
        System.out.println(DressBasket.getData());

        System.out.println("\nПоложили в нее два платья длины мини и одно длиной макси");
        DressBasket.addItem(mini, 2);
        DressBasket.addItem(maxi, 1);
        System.out.println("В корзине " + DressBasket.getSize() + " товара:");
        DressBasket.watchData();

        System.out.println("\nПередумали брать одно платье длиной мини");
        DressBasket.removeItem(mini);
        System.out.println("В корзине " + DressBasket.getSize() + " товара:");
        DressBasket.watchData();

    }
}
