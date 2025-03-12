package my.app;

import java.util.Scanner;

/**
 * Класс для чтения и вывода данных в консоль
 */
public class IOHandler {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Читает строку, вводимую с клавиатуры
     */
    public String readInputString() {
        return scanner.nextLine();
    }

    /**
     * Читает число, вводимое с клавиатуры
     */
    public int readInputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение. Введите число еще раз: ");
            }
        }
    }

    /**
     * Печатает сообщение
     */
    public void print(String message) {
        System.out.println(message);
    }
}