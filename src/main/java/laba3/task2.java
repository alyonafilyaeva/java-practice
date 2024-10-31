package laba3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива N: ");
            int N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("Размер массива должен быть положительным. Повторите ввод\n");
            } else {
                checkArray(N);
                return;
            }
        }
    }

    static void checkArray (int N) {
        int[] array = new int[N];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива:");
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < N; i++) {
            if ((array[i] % 2) == (array[i - 1] % 2)) {
                System.out.println("Первый нарушающий элемент на позиции: " + (i + 1));
                return;
            }
        }

        System.out.println("0");
    }
}
