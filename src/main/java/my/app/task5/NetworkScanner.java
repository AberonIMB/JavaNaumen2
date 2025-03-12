package my.app.task5;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Сканер сети. Ищет открытые порты в заданном диапазоне на заданном хосте
 */
public class NetworkScanner implements Task {

    private final String host;
    private final int startPort;
    private final int endPort;
    private volatile boolean isRunning = false; // слово volatile, поле изменяется в методе stop в потоке Input
                                                // и читается в потоке Scanner в методе runScanner

    public NetworkScanner(String host, int startPort, int endPort) {
        this.host = host;
        this.startPort = startPort;
        this.endPort = endPort;
    }

    @Override
    public void start() {
        isRunning = true;

        Thread scanThread = new Thread(this::runScanner);
        scanThread.start();
    }

    @Override
    public void stop() {
        isRunning = false;
    }

    /**
     * Проверяет открытые порты в заданном диапазоне
     */
    private void runScanner() {
        System.out.println("Начало сканирования сети с порта " + startPort + " по " + endPort + " на " + host);
        for (int port = startPort; port <= endPort; port++) {
            if (!isRunning) {
                break;
            }

            portScan(port);
        }

        System.out.println("Сканирование завершено");
    }

    /**
     * Проверяет открытый ли порт
     */
    private void portScan(int port) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), 70);
            System.out.println("\n---------------------------");
            System.out.printf("Порт %d открыт на %s\n", port, host);
            System.out.println("---------------------------\n");
        } catch (IOException e) {
//            System.out.println("Порт " + port + " закрыт на " + host);
        }
    }
}