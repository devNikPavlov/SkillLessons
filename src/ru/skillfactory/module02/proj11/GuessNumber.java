package ru.skillfactory.module02.proj11;

/*
Базовый вариант программы "Угадай число"
 */

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // Создаем экземпляр класса Random()
        Random rand = new Random();

        // Создаем переменную типа Int
        int randInt;

        // Сохраняем случайное число в переменной randLnt
        randInt = rand.nextInt(10) + 1;

        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число: ");

            // сохраняем введенное пользователем число в переменную userInput
            int userInput = console.nextInt();

            // проверяем условие и выводим сообщение
            if (userInput == randInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число");
                break;
            } else if (userInput > randInt) {
                System.out.println("Загаданное мною число меньше");
            } else {
                System.out.println("Загаданное мною число больше");
            }
        }
    }
}
