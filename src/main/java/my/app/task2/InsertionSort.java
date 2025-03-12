package my.app.task2;

import java.util.*;

/**
 * Класс сортирует список методом вставок
 */
public class InsertionSort {

    /**
     * Главный метод, который сортирует список и выводит его в консоль
     */
    public void sort(List<Double> array) {
        printArray(array);

        insertionSort(array);

        printArray(array);
    }

    /**
     * Печатает список в консоль
     */
    private void printArray(List<Double> array) {
        System.out.println(array.toString());
    }

    /**
     * Сортировка вставками
     */
    private void insertionSort(List<Double> array) {
        for (int i = 1; i < array.size(); i++) {

            int j = i - 1;
            double currentElement = array.get(i);

            while (j >= 0 && array.get(j) > currentElement) {
                array.set(j + 1, array.get(j));
                j--;
            }

            array.set(j + 1, currentElement);
        }
    }
}