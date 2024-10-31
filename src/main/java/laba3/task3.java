package laba3;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 7};
        int[] B = {2, 4, 5, 5};

        int[] C = mergeSortedArrays(A, B);

        System.out.println("Объединённый отсортированный массив C: " + Arrays.toString(C));
    }

     static int[] mergeSortedArrays(int[] A, int[] B) {
        int N = A.length;
        int[] C = new int[2 * N];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < N && j < N) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < N) {
            C[k++] = A[i++];
        }

        while (j < N) {
            C[k++] = B[j++];
        }

        return C;
    }
}
