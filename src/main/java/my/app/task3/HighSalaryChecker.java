package my.app.task3;

import java.util.List;

/**
 * Проверяет есть ли сотрудник с зарплатой более 100к
 */
public class HighSalaryChecker {

    /**
     * Проверяет есть ли сотрудник с зарплатой более 100к
     */
    public void check(List<Employee> employees) {
        employees.forEach(System.out::println);
        System.out.println("Есть ли сотрудники с зарплатой более 100к?");

        Employee employee = findEmployeeWithHighSalary(employees);

        System.out.println(employee == null ? "Нет" : employee);
    }

    /**
     * Поиск сотрудника с зарплатой более 100к
     */
    private Employee findEmployeeWithHighSalary(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.getSalary() > 100000)
                .findFirst()
                .orElse(null);
    }
}
