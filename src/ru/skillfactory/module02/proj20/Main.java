package ru.skillfactory.module02.proj20;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String name;
    static int age = 0;
    static double weight = 3.0;
    static byte hunger = 0;
    static byte needgames = 0;

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean program = true;
        char menu = '0';
        System.out.println("Добро пожаловать в CatLive!");
        System.out.println("Давайте создадим вашего первого питомца");
// Создаем кота
        System.out.println("Введите имя вашего питомца: ");
        name = scanner.nextLine();

// Кота создали
// Меню состояния кота
        while (program) {
            for (int variants = 0; variants < 500; variants++) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                if (variants < 1) {
                    System.out.println("Мы создали нашего кота! Давайте посмотрим на его состояние");
                }
                System.out.println("Выберите и введите пункт меню, для обзора действий с котом");
                System.out.println("1. Состояние кота");
                System.out.println("2. Кормление кота");
                System.out.println("3. Поиграть с котом");
                System.out.println("\"S\" - для выключения программы");
                menu = scanner.next().charAt(0);
                switch (menu) {
                    case '1':
                        System.out.println("Возраст кота: " + age);
                        System.out.println("Вес: " + weight + " кг");
                        System.out.println("Голод: " + hunger);
                        System.out.println("Игры: " + needgames);
                        System.out.println("Введите любую клавишу, что бы выйти из меню");
                        menu = scanner.next().charAt(0);
                        break;
                    case '2':

                }
            }
        }
    }

    public static void cateating() throws IOException, InterruptedException {
        char eatmenu;
        boolean eatHunger = true;
        Scanner scanner = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        while (eatHunger) {
            byte cycles = 0;
            while (cycles < 1) {
                cycles += 1;
                if (hunger >= 50) {
                    System.out.println("Похоже кот не голодный");
                    System.out.println("введите \"x\" для выхода");
                }
            }
        }
    }
}
