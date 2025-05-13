package lab.com.alura.conversordemoneda.api;

import com.google.gson.Gson;
import lab.com.alura.conversordemoneda.modelos.Conversor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateAPI {
    private  String codigoPais;
    public ExchangeRateAPI(String codigoPais) {
        this.codigoPais=codigoPais;
    }

    public Conversor convierteMoneda () {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3a334091b5ab66a2f88a0f56/latest/"+this.codigoPais);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo convertir moneda.");
        }
    }
}
