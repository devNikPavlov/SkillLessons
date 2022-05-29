package ru.skillfactory.module02.proj12;

// Расширенный вариант программы "Угадай число"

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //создаем сканнер для получения данных для установки пределов и количества попыток
        Scanner console = new Scanner(System.in);

        System.out.println("Введите максимальное количество попыток");
        int turnQuantity = console.nextInt();

        System.out.println("Введите нижний предел числа");
        int lowerBound = console.nextInt();

        System.out.println("Введите верхний предел числа");
        int upperBound = console.nextInt();

        //создаем экземпляр класса Random()
        Random rand = new Random();

        //создаем переменную типа Int
        int randInt;

        //сохраняем случайное число в переменной randInt
        randInt = lowerBound + rand.nextInt(upperBound - lowerBound + 1);
        int counter = 1;
        //создаем булеву переменную для сохранения статуса "угадал/не угадал"
        boolean status  = false;
        while (counter <= turnQuantity) {

            System.out.println("Введите число:");
            //сохраняем введенное пользователем число в переменной userInput
            int userInput = console.nextInt();

            //проверяем условие и выводим сообщение
            if (userInput == randInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число");
                status = true;
                break;
            } else if (userInput > randInt) {
                System.out.println("Загаданное мною число меньше");
                status = false;
            } else {
                System.out.println("Загаданное мною число больше");
                status = false;
            }
            counter++;
        }

        if (status == true) {
            System.out.printf("Конец игры. ");
            System.out.println("Мною было загадано число: " + randInt);
        }
    }
}
