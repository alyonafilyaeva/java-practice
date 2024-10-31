package laba2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        double x = getX();
        double n = getN();

        calculate(x, n);

    }

    static double getX () {
        double x;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число x (|x| < 1): ");
            x = scanner.nextDouble();
            if (x < 1.0 && x > -1.0) {
                return x;
            } else {
                System.out.print("Повторите ввод\n");
            }
        }

    }

    static double getN () {
        double n;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число n (n > 0): ");
            n = scanner.nextDouble();
            if (n > 0 && n % 1.0 == 0.0) {
                return n;
            } else {
                System.out.print("Повторите ввод\n");
            }
        }

    }

    static void calculate (double x, double n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + Math.pow(-1, i) * ((Math.pow(x, 2 * i + 1)) / (2 * i + 1));

            if (i == n) {
                System.out.printf("Результат выражения = %.7f\n", x + sum);
            }
        }

    }
}
