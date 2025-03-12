package my.app.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Генерирует список и заполняет его случайными числами от -50 до 50
 */
public class ListGenerator {

    /**
     * Создает и заполняет список случайными числами от -50 до 50 типа Double
     */
    public static List<Double> generateList(int arrayLength) {
        Random random = new Random();
        List<Double> arrayList = new ArrayList<>(arrayLength);

        for (int i = 0; i < arrayLength; i++) {
            arrayList.add(random.nextDouble(-50, 50));
        }

        return arrayList;
    }
}
