package laba1;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        // 10. Даны три числа. Найти сумму двух наибольших из них.
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите X: ");
        x = scanner.nextDouble();
        System.out.print("Введите Y: ");
        y = scanner.nextDouble();
        System.out.print("Введите Z: ");
        z = scanner.nextDouble();

        if (x >= y) {
            if (z >= y) {
                System.out.println(x + z);
            } else {
                System.out.println(x + y);
            }
            return;
        }

        if (y >= z) {
            if (x >= z) {
                System.out.println(y + x);
            } else {
                System.out.println(y + z);
            }
            return;
        }

        if (z >= x) {
            if (y >= x) {
                System.out.println(z + y);
            } else {
                System.out.println(z + x);
            }
        }
    }
}
