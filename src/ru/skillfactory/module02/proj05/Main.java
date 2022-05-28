package ru.skillfactory.module02.proj05;

public class Main {
    public static void main(String[] args) {
        int grade = 3;

        switch (grade) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Средне");
                break;
            case 2:
                System.out.println("Можно лучше");
                break;
            case 1:
                System.out.println("Придется переделать");
                break;
            default:
                System.out.println("Неверная оценка");
        }
    }
}
