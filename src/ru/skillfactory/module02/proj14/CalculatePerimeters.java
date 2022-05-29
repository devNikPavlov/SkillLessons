package ru.skillfactory.module02.proj14;

public class CalculatePerimeters {

    public static void main(String[] args) {
        int sideLengthTriangle = 3;
        int sideLengthSquare = 4;
        int radius = 5;
        System.out.println("Периметр треугольника = " + PerimeterTriangle(sideLengthTriangle));
        System.out.println("Периметр квадрата = " + PerimeterSquare(sideLengthSquare));
        System.out.println("Периметр окружности = " + PerimeterCircle(radius));
    }

    public static int PerimeterTriangle(int lenght) {
        int P = 3 * lenght;
        return P;
    }

    public static int PerimeterSquare(int lenght) {
        int P = 4 * lenght;
        return P;
    }

    public static int PerimeterCircle(int radius) {
        double PI = 3.14159;
        double P = 2 * PI * radius;
        return (int) P;
    }
}
