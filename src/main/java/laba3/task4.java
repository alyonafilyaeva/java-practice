package laba3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядок квадратной матрицы M: ");
        int M = scanner.nextInt();
        int[][] A = new int[M][M];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        printElements(A, M);
    }

    public static void printElements(int[][] A, int M) {
        int startColumn = 0;
        int endColumn = M - 1;
        int startRow = 0;
        int endRow = M - 1;

        while (startColumn <= endColumn && startRow <= endRow) {
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(A[i][startColumn] + " ");
            }
            startColumn++;

            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(A[endRow][j] + " ");
            }
            endRow--;
        }
    }
}
