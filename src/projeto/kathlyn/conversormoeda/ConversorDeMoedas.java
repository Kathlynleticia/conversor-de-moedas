package projeto.kathlyn.conversormoeda;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConversorDeMoedas {

    private static final String API_KEY = "21d6f1d7d46e0c0f0ce6f579";

    public double buscaTaxa(String moedaEscolhida, String moedaConvertida) {

        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaEscolhida);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(moeda)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            RepostaApi repostaApi = new Gson().fromJson(response.body(),RepostaApi.class);

            Map<String, Double> taxas = repostaApi.getConversion_rates();
            if (taxas.containsKey(moedaConvertida)) {
                return taxas.get(moedaConvertida);
            } else {
                throw new RuntimeException("Moeda de destino não encontrada.");
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar taxa de Câmbio.");
        }

    }


}
