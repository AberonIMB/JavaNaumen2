package my.app.task5;

import my.app.IOHandler;

import java.util.Scanner;

public class Task5 {

    private final IOHandler ioHandler;

    public Task5(IOHandler ioHandler) {
        this.ioHandler = ioHandler;
    }

    public void execute() {
        ioHandler.print("Введите хост: ");
        String host = ioHandler.readInputString();

        ioHandler.print("Введите начальный порт: ");
        int startPort = ioHandler.readInputInt();

        ioHandler.print("Введите конечный порт: ");
        int endPort = ioHandler.readInputInt();

        NetworkScanner networkScanner = new NetworkScanner(host, startPort, endPort);

        networkScanner.start();

        Thread inputThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Нажмите любую кнопку для прерывания работы...");
            scanner.nextLine();
            networkScanner.stop();
        });

        inputThread.setDaemon(true);
        inputThread.start();
    }
}

