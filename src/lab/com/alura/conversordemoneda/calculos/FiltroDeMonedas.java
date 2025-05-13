package lab.com.alura.conversordemoneda.calculos;

import lab.com.alura.conversordemoneda.api.ExchangeRateAPI;

public class FiltroDeMonedas {
    private final ExchangeRateAPI api;

    public FiltroDeMonedas(ExchangeRateAPI api) {
        this.api = api;
    }

    public Double filtraValorDeMoneda(String codigoPaisBase,String codigoPaisFinal) {
        return api.convierteMoneda().conversion_rates().get(codigoPaisFinal);
    }
}
