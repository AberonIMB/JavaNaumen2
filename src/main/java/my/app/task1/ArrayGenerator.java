package my.app.task1;

import java.util.Random;

/**
 * Генерирует массив и заполняет его случайными числами от -50 до 50
 */
public class ArrayGenerator {

    /**
     * Создает массив и заполняет его случайными числами от -50 до 50
     */
    public static int[] generateArray(int arrayLength) {
        Random random = new Random();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(-50, 50);
        }

        return array;
    }
}