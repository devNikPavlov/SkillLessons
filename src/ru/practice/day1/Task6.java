package ru.practice.day1;

/**
 * @author Pavlov Nikolay
 * Объявите переменную типа int, имя переменной - k
 * Присвойте этой переменной какую-нибудь цифру от 1 до 9
 * Используя цикл на ваше усмотрение
 * выведите в консоль таблицу умножения для этой цифры - 1 * k = ...
 */

public class Task6 {
    public static void main(String[] args) {
        int k = 5;

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + i * k);
        }
    }
}
