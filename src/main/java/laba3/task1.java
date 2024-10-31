package laba3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число N (> 2): ");
            int N = scanner.nextInt();
            if (N <= 2) {
                System.out.println("N должно быть больше 2. Повторите ввод\n");
            } else {
                getFibonacci(N);
                return;
            }
        }
    }

    static void getFibonacci (int N) {
        int[] fibonacciArray = new int[N];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i < N; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        System.out.println("Первые " + N + " чисел Фибоначчи:");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}
