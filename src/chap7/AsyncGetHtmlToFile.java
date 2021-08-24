package chap7;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

public class AsyncGetHtmlToFile {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create("https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html"))
                                         .build();

        var response = client.sendAsync(request, HttpResponse.BodyHandlers.ofFile(Paths.get("http.html"))).thenApply(HttpResponse::body);
        response.get();
    }
}
