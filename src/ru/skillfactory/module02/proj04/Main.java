package ru.skillfactory.module02.proj04;

public class Main {
    public static void main(String[] args) {
        // Измение значений a
        int a = -9;

        if (a > 9) {
            System.out.println("a больше 9");
        } else if (a == 9) {
            System.out.println("a равно 9");
        } else if (a <= 9 && a > 0) {
            System.out.println("a меньше 9");
        } else {
            System.out.println("Условие не выполнено");
        }
    }
}
