package chap7;

import java.io.IOException;
import java.net.Authenticator;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create("http://www.google.com"))
                                         .build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        HttpClient httpClient = HttpClient.newBuilder()
                                          .version(HttpClient.Version.HTTP_2) // version
                                          .followRedirects(HttpClient.Redirect.NORMAL) // redirect policy
                                          .authenticator(Authenticator.getDefault())
                                          .build();

    }

    private void variousRequestParams() {
        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(URI.create("http://www.google.com"))
                                         .timeout(Duration.ofSeconds(240))
                                         .header("Content-Type", "text/plain")
                                         .build();
    }

}
