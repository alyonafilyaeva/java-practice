package laba2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*
    Расчитать общую сумму заказа (доставка + заказ + скидка) в зависимости от суммы за товары
    Если сумма меньше 500, +300 за доставку
    Если сумма больше 1000, скидка 5%
    Если сумма больше 3000, скидка 10%
    */

        final String mainMenu = """
                1) Узнать о программе
                2) Расчитать стоимость заказа
                3) Узнать о версии программы
                4) Узнать о разработчике
                5) Выйти
                """;

        double sum;

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
                        System.out.print("Введите сумму за товары: ");
                        sum = scanner.nextDouble();

                        if (validate(sum)) {
                            countResult(sum);
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

    static void countResult (double sum) {
        final double delivery = 300;
        final double sale5 = 0.05;
        final double sale10 = 0.1;
        double result;

        if (sum < 500) {
            result = sum + delivery;
            System.out.println("Общая сумма заказа: " + result);
            return;
        }

        if (sum < 1000) {
            result = sum;
            System.out.println("Общая сумма заказа: " + result);
            return;
        }

        if (sum >= 1000 && sum < 2000) {
            result = sum - sum * sale5;
            System.out.println("Общая сумма заказа: " + result);
            return;
        }

        if (sum >= 2000) {
            result = sum - sum * sale10;
            System.out.println("Общая сумма заказа: " + result);
        }
    }

    static void printVersion() {
        System.out.println("1.1");
    }

    static void printAboutDeveloper() {
        System.out.println("Junior mid level lead front-end back-door back-space chicken tikka massala разработчик");
    }
}
