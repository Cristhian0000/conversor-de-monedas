package lab.com.alura.conversordemoneda.calculos;

public class CalculadoraDeMonedas {
    private double montoEnOtraMoneda;
    private final FiltroDeMonedas filtro;

    public CalculadoraDeMonedas(FiltroDeMonedas filtro) {
        this.filtro = filtro;
    }

    public void mostrarMontoConvertido(String codigoPaisBase,String codigoPaisFinal, Double valorMontoBase){
        System.out.println("El valor de "+valorMontoBase+" ["+ codigoPaisBase+"] corresponde al valor final de =>>> "+this.montoEnOtraMoneda+ "["+codigoPaisFinal+"]");
        System.out.println();
    }

    public void calcularMontoEnOtraMoneda(String codigoPaisBase,String codigoPaisFinal,Double valorMontoBase){
        Double valorMontoFinal = this.filtro.filtraValorDeMoneda(codigoPaisBase,codigoPaisFinal);
        this.montoEnOtraMoneda = valorMontoBase * valorMontoFinal;

    }
}
