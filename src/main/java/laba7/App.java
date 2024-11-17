package laba7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    static Product shoes = new Shoes("Туфли", "обувь", new Cost(3600), 37 );
    static Product sneakers = new Shoes("Кроссовки", "обувь", new Cost(1200), 40);
    static Product mini = new Dress("Платье длиной мини", "платье",new Cost(2700), "Gucci", "pink");
    static Product maxi = new Dress("Платье длиной макси", "платье", new Cost(4200), "Zara", "black");

    Product[] products = {shoes, sneakers, mini, maxi};

    public static void main(String[] args) throws CloneNotSupportedException {

        Shoes[] shoesArr = {new Shoes("Кроссовки", "обувь", new Cost(1200), 40), new Shoes("Туфли", "обувь", new Cost(3600), 37), new Shoes("Тапочки", "обувь", new Cost(1200), 39)};
        System.out.println("До сортировки");
        for (Shoes i : shoesArr) {
            System.out.println(i.getSize());
        }
        Arrays.sort(shoesArr);
        System.out.println("После сортировки");
        for (Shoes i : shoesArr) {
            System.out.println(i.getSize());
        }

        Shoes shoes1 = new Shoes("Кроссовки", "обувь", new Cost(1200), 40);
        Shoes shoes2 = (Shoes) shoes1.clone();

        System.out.println(shoes1.equals(shoes2));
        System.out.println(shoes1 != shoes2);
    }
}
