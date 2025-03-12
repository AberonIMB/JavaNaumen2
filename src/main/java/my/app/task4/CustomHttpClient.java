package my.app.task4;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Кастомный HTTP-клиент, который отправляет запрос на https://httpbin.org/get и извлекает из него значение Host
 */
public class CustomHttpClient {

    /**
     * Отправляет запрос на https://httpbin.org/get и извлекает из него значение Host
     */
    public void getHost() throws IOException, InterruptedException {
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/get"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(response.body());

            String host = jsonNode.get("headers").get("Host").asText();

            System.out.println("Host: " + host);
        }
    }
}
