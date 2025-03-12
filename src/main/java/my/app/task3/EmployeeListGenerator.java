package my.app.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Генерирует список сотрудников
 */
public class EmployeeListGenerator {

    /**
     * Создает список сотрудников и заполняет его случайными значениями
     */
    public static List<Employee> generateList() {
        Random random = new Random();

        List<Employee> employees = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            employees.add(new Employee(
                    Integer.toString(i),
                    i,
                    Integer.toString(i),
                    random.nextDouble(50000, 110000)));
        }

        return employees;
    }
}