package ru.practice.day2;

import java.util.Scanner;

/**
 * @author Pavlov Nikolay
 *
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner
 * число, соответствующее количеству этажей в здании.
 * Используя условие оператора if, необходимо вывести в консоль сообщение о типе такого дома
 * если этажей 1-4 -"Малоэтажный дом", 5-8 -"Среднеэтажный дом", 9 и более -"Многоэтажный дом"
 * Так же, необходимо учесть что может быть введено отрицательное значение. В этом случает программа должна вывести ошибку
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorCount = scanner.nextInt();

        if (floorCount >= 1 && floorCount <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorCount >= 5 && floorCount <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorCount >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Введены не правельные параметры");
        }
    }

}
















