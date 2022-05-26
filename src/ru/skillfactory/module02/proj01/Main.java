package ru.skillfactory.module02.proj01;

public class Main {
    // Метод, который стартует ваши программы, то есть это своего рода начальная точка, с этого метода
    // начинается выполнение кода
    public static void main(String[] args) {
        // Создаем объект на основании класса
        Cookie cookie = new Cookie();
        // Вызываем метод нашего класса, чтобы испеч печеньки
        cookie.bake();
    }
}
