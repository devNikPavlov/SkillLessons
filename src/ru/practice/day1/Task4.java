package ru.practice.day1;

/**
 * @author Pavlov Nikolay
 * Объявите переменную типа int, имя переменной - age. Присвойте этой переменной свой возраст.
 * Используя цикл while, выведите в столбик строки вида "Мой возраст Х",
 * где Х - это число, которое принимает значение, начиная от вашего текущего возраста до 100 с шагом увеличение равным 5.
 */

public class Task4 {
    public static void main(String[] args) {
        int age = 23;

        while (age <= 100) {
            System.out.println("Мой возраст " + age);
            age += 5;
        }
    }
}
