package ru.practice.day2;

import java.util.Scanner;

/**
 * @author Pavlov Nikolay
 *
 * Есть 2 числа, которые задаются пользователем через консоль (назовем их a и b).
 * Вывести все числа из диапазона между А и Б, которые деляться на 5 без остатка, но не деляться на 10
 * Пример: вводим в консоль: 7 78
 * Вывод: 15 25 35 45 55 65 75
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 10) {
                System.out.print(i + " ");
            }
        }
    }
}
