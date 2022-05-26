package ru.skillfactory.module02.proj03;

public class Main {
    public static void main(String[] args) {
        // Явили миру рыцаря
        Knight knight = new Knight();

        // Отправляем его за принцессой
        knight.goAndSaveThePrincess();
    }
}

class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {

    }

    public void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        System.out.println("Да иду уже ...");
    }

    private void sharpenBlade() {
        System.out.println("Точим меч");
    }

    private void getFood() {
        System.out.println("Собираем консервы");
    }

    private void assembleTeam() {
        System.out.println("Будем оруженосца");
    }
}
