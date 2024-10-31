package laba4.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
    Расчитать общую сумму заказа (доставка + заказ + скидка) в зависимости от суммы за товары
    Если сумма меньше 500, +300 за доставку
    Если сумма от 1000, скидка 5%
    Если сумма от 3000, скидка 10%
    Если количество товаров больше 10 и сумма от 5000, скидка 15%
    При этом скидки не суммируются
    */


        final String mainMenu = """
                1) Узнать о программе
                2) Расчитать стоимость заказа
                3) Узнать о версии программы
                4) Узнать о разработчике
                5) Выйти
                """;

        double sum = 0; // сумма покупок
        int N; // количество товаров

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(mainMenu);
            System.out.print("Ваш выбор: ");
            int answer = scanner.nextInt();
            if (answer == 5) break;

            switch (answer) {
                case 1 -> printAboutProgram();
                case 2 -> {
                    while (true) {
                        System.out.print("Введите количество товаров: ");
                        N = scanner.nextInt();
                        double[] products = new double[N]; // массив цен за купленные товары

                        System.out.print("Введите стоимость каждого товара: ");
                        for (int i = 0; i < N; i++) {
                            products[i] = scanner.nextDouble();
                        }

                        for (double el: products) {
                            sum += el;
                        }

                        if (validate(sum)) {
                            countResult(sum, N);
                            sum = 0;
                            break;
                        } else {
                            System.out.print("Повторите ввод\n");
                        }
                    }
                }
                case 3 -> printVersion();
                case 4 -> printAboutDeveloper();
                default -> System.out.println("Неверный ввод. Повторите попытку.");
            }
            System.out.println("-----------------------------------");
        }
        System.out.println("Завершение работы программы...\nЖдем еще!");
    }

    static void printAboutProgram() {
        System.out.println("Добрый день! С помощью этой программой вы сможете вычислить итоговую стоимость своих покупок");
    }

    static boolean validate (double sum) {
        if (sum <= 0) {
            System.out.println("Неверное значение!");
            return false;
        }
        return true;
    }

    static void countResult (double sum, int N) {
        Sale sale = new Sale(300, 0.05, 0.1, 0.15);
        double result;

        if (sum < 500) {
            System.out.println(sale.getDelivery() + " за доставку\n");
            System.out.println("Общая сумма заказа: " + sale.applyDelivery(sum));
            return;
        }

        if (sum < 1000) {
            System.out.println("Скидок нет\n");
            System.out.println("Общая сумма заказа: " + sum);
            return;
        }

        if (sum >= 1000 && sum < 2000) {
            System.out.println("Скидка 5%\n");
            System.out.println("Общая сумма заказа: " + sale.applySale(sum, 5));
            return;
        }

        if (sum >= 2000 && N <= 10) {
            System.out.println("Скидка 10%\n");
            System.out.println("Общая сумма заказа: " + sale.applySale(sum, 10));
            return;
        }

        if (sum >= 5000 && N > 10) {
            System.out.println("Скидка 15%\n");
            System.out.println("Общая сумма заказа: " + sale.applySale(sum, 15));
        }
    }

    static void printVersion() {
        System.out.println("1.4");
    }

    static void printAboutDeveloper() {
        System.out.println("Junior mid level lead front-end back-door back-space chicken tikka massala разработчик");
    }
}
