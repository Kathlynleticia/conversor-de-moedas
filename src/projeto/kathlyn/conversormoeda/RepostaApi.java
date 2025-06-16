package projeto.kathlyn.conversormoeda;

import java.util.Map;

public class RepostaApi {
    private Map<String, Double> conversion_rates;

    Map<String,Double> getConversion_rates() {
        return conversion_rates;
    }
}
