package Api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class conexionALaApi {
    private static final String url = "https://v6.exchangerate-api.com/v6/f43309cf036166ef72fcbe77/latest/";
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
    HttpClient client = HttpClient.newHttpClient();

    public RespuestaApi obtenerTasas(String monedaBase) throws Exception {
            String urlCompleta = url + monedaBase;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlCompleta))
                    .build();
            HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(response.body(), RespuestaApi.class);

        }

}