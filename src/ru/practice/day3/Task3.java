package ru.practice.day3;

import java.util.Scanner;

/**
 * @author Pavlov Nikolay
 *
 * Релизовать программу, которая 5 раз запрашивает от пользователя 2 числа - делимое и делитель
 * 2 этих числа программа расчитыват результат деления и выводит его в консоль
 * Если пользователь вводит 0 в качестве делителя, вмсто того, чтобы останавливать работу цикла принудительно,
 * мы пропускаем итерацию и выводим сообщение "Деление на 0"
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            counter++;

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(a/ b);
        }
    }
}
