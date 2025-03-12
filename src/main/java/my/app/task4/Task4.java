package my.app.task4;

import java.io.IOException;

public class Task4 {

    private final CustomHttpClient customHttpClient = new CustomHttpClient();

    public void execute() throws IOException, InterruptedException {
        customHttpClient.getHost();
    }
}
