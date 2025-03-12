package my.app.task1;

import my.app.IOHandler;


//Мне показалось, что такая структура файлов будет более понятной
public class Task1 {
    private final IOHandler ioHandler;
    private final PositiveSumCalculator positiveSumCalculator = new PositiveSumCalculator();

    public Task1(IOHandler ioHandler) {
        this.ioHandler = ioHandler;
    }

    public void execute() {
        ioHandler.print("Введите длину массива для подсчета суммы положительных элементов: ");

        int arrayLength = ioHandler.readInputInt();
        int[] array = ArrayGenerator.generateArray(arrayLength);
        positiveSumCalculator.calculate(array);
    }
}