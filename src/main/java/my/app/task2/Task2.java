package my.app.task2;

import my.app.IOHandler;

import java.util.List;

public class Task2 {

    private final IOHandler ioHandler;
    private final InsertionSort insertionSort = new InsertionSort();

    public Task2(IOHandler ioHandler) {
        this.ioHandler = ioHandler;
    }

    public void execute() {
        ioHandler.print("Введите длину списка для сортировки вставками: ");

        int arrayLength = ioHandler.readInputInt();
        List<Double> list = ListGenerator.generateList(arrayLength);
        insertionSort.sort(list);
    }
}
