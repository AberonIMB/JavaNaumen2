package my.app.task1;

import java.util.Arrays;

/**
 * Считает сумму положительных элементов массива
 */
public class PositiveSumCalculator {

    /**
     * Основной метод, который считает сумму положительных элементов массива с заданной длиной и выводит ответ
     */
    public void calculate(int[] array) {
        int sum = getSum(array);
        printAnswer(array, sum);
    }

    /**
     * Считает сумму положительных элементов массива
     */
    private int getSum(int[] array) {
        int sum = 0;
        for (int num: array) {
            if (num > 0) {
                sum += num;
            }
        }

        return sum;
    }

    /**
     * Печатает в консоль массив и сумму положительных элементов
     */
    private void printAnswer(int[] array, int sum) {
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(array));

        System.out.printf("Сумма положительных элементов: %d\n", sum);
    }
}