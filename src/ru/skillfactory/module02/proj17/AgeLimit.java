package ru.skillfactory.module02.proj17;

/*
Салон пирсинга, лимит возраста
 */

public class AgeLimit {
    public static void main(String[] args) {
        int age = 17;
        if (age < 14) {
            System.out.println("Тебе всего " + age + ", разрешон прокол ушей исключительно в присутствии родителей");
        }
        if (age >= 14 && age < 18) {
            System.out.println("Тебе уже " + age + ", ты можешь проколоть: нос, пупок, язык, но только в присутствии родителей");
        }
        if (age > 18) {
            System.out.println("Ты уже взрослый, тебе можно все, в рамках закона");
        }
    }
}
