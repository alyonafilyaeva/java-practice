package laba4.task1;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(0, 0, 3, 0, 0, 4);

        double lengthsSide1 = triangle.getSideLengths(1);
        double lengthsSide2 = triangle.getSideLengths(2);
        double lengthsSide3 = triangle.getSideLengths(3);
        System.out.println("Длины сторон треугольника: " + lengthsSide1 + ", " + lengthsSide2 + ", " + lengthsSide3);

        double area = triangle.getArea();
        System.out.println("Площадь треугольника: " + area);

        double perimeter = triangle.getPerimeter();
        System.out.println("Периметр треугольника: " + perimeter);
    }
}
