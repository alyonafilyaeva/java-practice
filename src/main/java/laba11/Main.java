package laba11;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPositiveNumber = n -> n > 0;
        System.out.println(isPositiveNumber.test(8));
        System.out.println(isPositiveNumber.test(-3));

        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
        System.out.println(sum.apply(5, 10));
        System.out.println(sum.apply(-7, 8));

        BiFunction<String, Integer, String> doubleString = (x, y) -> x.repeat(y);
        System.out.println(doubleString.apply("ма", 3));
        System.out.println(doubleString.apply("ля", 5));

        Consumer<String> greeting = x -> System.out.println("Hello " + x + "!!!");
        greeting.accept("Elena");
        greeting.accept("Ivan");

        Function<String, Integer> convertStringToInt = Integer::valueOf;
        System.out.println(convertStringToInt.apply("293"));
        System.out.println(convertStringToInt.apply("-126"));

        UnaryOperator<Integer> cubeValue = x -> x * x * x;
        System.out.println(cubeValue.apply(3));
        System.out.println(cubeValue.apply(-4));
    }
}
