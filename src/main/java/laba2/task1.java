package laba2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        double x;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число x: ");
            x = scanner.nextDouble();

            if (x % 1.0 == 0.0) {
                calculate(x);
                break;
            } else {
                System.out.print("Повторите ввод\n");
            }
        }

    }

    static void calculate (double x) {
        double sum = 0;

        for (int i = 2; i <= x; i++) {
            sum = sum + 1/(Math.log(i));

            if (i == x) {
                System.out.printf("Сумма чисел = %.3f\n", sum);
            }
        }
    }
}
