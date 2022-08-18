package ru.practice.day3;

import java.util.Scanner;

/**
 * @author Pavlov Nikolay
 *
 * Реализовать программу, которая пока работает, принимает на вход от пользователя 2 числа - делимое и делитель
 * Для этих 2 чисел программа рассчитывает результат деления и выводит его в консоль
 * Программа останавливает свою работу тогда, когда пользователь вводит 0 и в качестве делителя
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                break;
            }

            System.out.println(a / b);
        }
    }
}
