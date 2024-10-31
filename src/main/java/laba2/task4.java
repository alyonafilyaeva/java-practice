package laba2;

public class task4 {
    public static void main(String[] args) {
        getInterval(2,1);
    }

    public static void getInterval (double a, double b) {
        double c;
        double d;
        double max;
        double min;

        if (a > b) {
            System.out.printf("%s\n%s\n", b, a);
            max = a;
            min = b;
        } else {
            System.out.printf("%s\n%s\n", a, b);
            max = b;
            min = a;
        }

        c = Math.ceil(max);
        d = Math.floor(min);
        System.out.printf("%s >= %s > %s >= %s", c, max, min, d);
    }
}
