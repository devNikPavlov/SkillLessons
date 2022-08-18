package ru.practice.day3;

import java.util.Scanner;

/**
 * @author Pavlov Nikolay
 *
 * Релизовать программу, которая в консоль выводит название страны, принимая на вход название города
 * Программа должна работать до тех пор, пока не будет введено слово "Stop"
 * Москва, Владимосток - Россия
 * Рим, Милан - Италия
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String city = scanner.nextLine();

            if (city.equals("Stop"))
                break;

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;

                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;

                case "Ливерауль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;

                case "Берлин":
                case "Мюнхин":
                case "Кёльн":
                    System.out.println("Германия");
                    break;

                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
