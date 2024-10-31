package laba2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int n;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число n (n > 0): ");
            n = scanner.nextInt();

            if (n % 1 == 0 && n > 0) {
                hasOddNumber(n);
                break;
            } else {
                System.out.print("Повторите ввод\n");
            }
        }

    }

    static void hasOddNumber (int n) {
        boolean isOdd = false;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                isOdd = true;
                break;
            }
            n /= 10;
        }

        System.out.print(isOdd);
    }
}
