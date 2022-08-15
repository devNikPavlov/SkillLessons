package ru.practice.day1;

/**
 * @author Pavlov Nikolay
 *
 * Вывести на экран слово "JAVA", в строку, чтобы оно повторялось 10 раз, используя цикл while
 */

public class Task1 {
    public static void main(String[] args) {
        // создаем переменную с числом 0
        int counter = 0;

        while (counter < 10) {
            System.out.print("JAVA ");
            counter++;
        }
    }
}
