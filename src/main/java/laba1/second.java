package laba1;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите X: ");
        x = scanner.nextDouble();
        y = x * Math.pow(x, 0.5) + Math.pow(x, 5) + Math.exp(x);

        System.out.println(y);
    }
}
