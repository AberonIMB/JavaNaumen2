package my.app;


import my.app.task1.Task1;
import my.app.task2.Task2;
import my.app.task3.Task3;
import my.app.task4.Task4;
import my.app.task5.Task5;

import java.io.IOException;


public class Main {

    private static final IOHandler ioHandler = new IOHandler();
    private static final Task1 task1 = new Task1(ioHandler);
    private static final Task2 task2 = new Task2(ioHandler);
    private static final Task3 task3 = new Task3();
    private static final Task4 task4 = new Task4();
    private static final Task5 task5 = new Task5(ioHandler);


    public static void main(String[] args) throws IOException, InterruptedException {
        ioHandler.print("Перейти на следующую задачу - нажмите Enter");

        ioHandler.print("Задание 1: ");
        task1.execute();
        ioHandler.print("--------------");
        ioHandler.readInputString();

        ioHandler.print("Задание 2: ");
        task2.execute();
        ioHandler.print("--------------");
        ioHandler.readInputString();

        ioHandler.print("Задание 3: ");
        task3.execute();
        ioHandler.print("--------------");
        ioHandler.readInputString();

        ioHandler.print("Задание 4: ");
        task4.execute();
        ioHandler.print("--------------");
        ioHandler.readInputString();

        ioHandler.print("Задание 5: ");
        task5.execute();
    }
}