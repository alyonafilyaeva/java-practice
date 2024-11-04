package laba5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    static Product shoes = new Shoes("Туфли", "обувь", new Cost(3600), 37 );
    static Product sneakers = new Shoes("Кроссовки", "обувь", new Cost(1200), 40);
    static Product mini = new Dress("Платье длиной мини", "платье",new Cost(2700), "Gucci");
    static Product maxi = new Dress("Платье длиной макси", "платье", new Cost(4200), "Zara");

    Product[] products = {shoes, sneakers, mini, maxi};

    public static void main(String[] args) {

        final String mainMenu = """
                1) Узнать обо всех товарах
                2) Узнать стоимость товара
                3) Сравнить стоимость двух товаров
                4) Выйти
                """;


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(mainMenu);
            System.out.print("Ваш выбор: ");
            int answer = scanner.nextInt();
            if (answer == 4) break;

            switch (answer) {
                case 1 -> getAllInformation();
                case 2 -> getCost();
                case 3 -> equalCost();
                default -> System.out.println("Неверный ввод. Повторите попытку.");
            }
            System.out.println("-----------------------------------");
        }
        System.out.println("Завершение работы программы...\nЖдем еще!");
    }

    public static void getAllInformation() {
        List<Product> products = Arrays.asList(shoes, sneakers, mini, maxi);
        for (Product p : products) {
            p.setTitle(p.getTitle().toUpperCase());// полиморфизм ссылок
        }

        for (Product p : products) {
           System.out.println(p.toString());// полиморфизм методов
        }

    }

    public static void getCost() {

        final String productsMenu = """
                1) Туфли
                2) Кроссовки
                3) Платье длиной мини
                4) Платье длиной макси
                """;

        Scanner scanner = new Scanner(System.in);
            System.out.println(productsMenu);
            System.out.print("Ваш выбор: ");
            int answer = scanner.nextInt();

            switch (answer) {
                case 1 -> System.out.println(shoes.getCost().getCost());
                case 2 -> System.out.println(sneakers.getCost().getCost());
                case 3 -> System.out.println(mini.getCost().getCost());
                case 4 -> System.out.println(maxi.getCost().getCost());
                default -> System.out.println("Неверный ввод. Повторите попытку.");
            }
            System.out.println("-----------------------------------");

    }

    public static void equalCost() {

        final String productsMenu = """
                1) Туфли и кроссовки
                2) Платье длиной мини и платье длиной макси
                """;

        Scanner scanner = new Scanner(System.in);
        System.out.println(productsMenu);
        System.out.print("Ваш выбор: ");
        int answer = scanner.nextInt();

        switch (answer) {
            case 1 -> System.out.println(shoes.getCost().equals(sneakers) ? shoes.title + " дороже, чем " + sneakers.title : sneakers.title + " дороже, чем " + shoes.title);
            case 2 -> System.out.println(mini.getCost().equals(maxi) ? mini.title + " дороже, чем " + maxi.title : maxi.title + " дороже, чем " + mini.title);
            default -> System.out.println("Неверный ввод. Повторите попытку.");
        }
        System.out.println("-----------------------------------");

    }
}
