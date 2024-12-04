import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        // Получение порта из переменной среды
        String port = System.getenv("PORT");
        if (port == null) {
            port = "8080"; // Укажите порт по умолчанию
        }

        // Настройка HTTP-сервера
        HttpServer server = HttpServer.create(new InetSocketAddress(Integer.parseInt(port)), 0);
        server.createContext("/", exchange -> {
            String response = "Hello, Maven in Docker!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });

        System.out.println("Server is running on port " + port);
        server.start();
    }
}
