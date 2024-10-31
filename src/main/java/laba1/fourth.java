package laba1;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        /*
    Расчитать общую сумму заказа (доставка + заказ + скидка) в зависимости от суммы за товары
    Если сумма меньше 500, +300 за доставку
    Если сумма больше 1000, скидка 5%
    Если сумма больше 3000, скидка 10%
    */
        // объявление констант и суммы за заказ
        double sum;
        final double delivery = 300;
        final double sale5 = 0.05;
        final double sale10 = 0.1;
        double result;

        // приветствие
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день! С помощью этой программой вы сможете вычислить итоговую стоимость своих покупок");

        // получение данных
        System.out.print("Введите сумму за товары: ");
        sum = scanner.nextDouble();

        // проверка полученных данных
        if (sum < 0) {
            System.out.println("Сумма не может быть отрицательной, введите корректные данные");
            return;
        }
        /* было бы славно еще проверять, что пользователь вводит не символы,
        но я так поняла, java сама выкидывает ошибку и проверить это нельзя
         */

        // вычисление общей суммы заказа
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
            return;
        }


    }
}
