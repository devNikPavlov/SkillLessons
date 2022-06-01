package ru.skillfactory.module02.proj18;

/*
Квартира Коли на 12 этажей выше Пети. Петя поднимаясь к Коле прошел пол пути и оказался на 8 этаже. Где жимут мальчики
 */
public class Home {
    public static void main(String[] args) {
        int kolya = 12;
        int petya = 8;
        kolya /= 2;
        kolya += petya;
        petya = kolya - 12;
        System.out.println("Петя живет на " + petya + " этаже");
        System.out.println("Коля живет на " + kolya + " этаже");
    }
}
