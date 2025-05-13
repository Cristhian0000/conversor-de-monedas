package lab.com.alura.conversordemoneda.principal;

import lab.com.alura.conversordemoneda.api.ExchangeRateAPI;
import lab.com.alura.conversordemoneda.calculos.CalculadoraDeMonedas;
import lab.com.alura.conversordemoneda.calculos.FiltroDeMonedas;
import lab.com.alura.conversordemoneda.modelos.Conversor;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {

        ExchangeRateAPI api = new ExchangeRateAPI("USD");
        FiltroDeMonedas filtro = new FiltroDeMonedas(api);
        CalculadoraDeMonedas calculo = new CalculadoraDeMonedas(filtro);
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        double valorMontoBase = 0;
        String menu = """
                ************************************************
                Sea bienvenido/a al conversor de moneda @>--,--'-- 
                1) Dolar =>> Peso Argentino
                2) Peso Argentino =>> Dolar
                3) Dolar =>> Real Brasileño
                4) Real Brasileño =>> Dolar
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano ==> Dolar
                7) Salir
                
                Eliga una opcion valida:
                ************************************************
                """;
        while (true) {
            System.out.println(menu);
            opcion = lectura.nextInt();
            if (opcion == 7) {
                return;
            }
            System.out.println("Ingrese el valor que desea convertir");
            valorMontoBase = lectura.nextDouble();

            switch (opcion) {
                case 1:
                    calculo.calcularMontoEnOtraMoneda("USD", "ARS", valorMontoBase);
                    calculo.mostrarMontoConvertido("USD", "ARS", valorMontoBase);
                    break;

                case 2:
                    calculo.calcularMontoEnOtraMoneda("ARS", "USD", valorMontoBase);
                    calculo.mostrarMontoConvertido("ARS", "USD", valorMontoBase);
                    break;
                case 3:
                    calculo.calcularMontoEnOtraMoneda("USD", "BRL", valorMontoBase);
                    calculo.mostrarMontoConvertido("USD", "BRL", valorMontoBase);
                    break;
                case 4:
                    calculo.calcularMontoEnOtraMoneda("BRL", "USD", valorMontoBase);
                    calculo.mostrarMontoConvertido("BRL", "USD", valorMontoBase);
                    break;
                case 5:
                    calculo.calcularMontoEnOtraMoneda("USD", "COP", valorMontoBase);
                    calculo.mostrarMontoConvertido("USD", "COP", valorMontoBase);
                    break;
                case 6:
                    calculo.calcularMontoEnOtraMoneda("COP", "USD", valorMontoBase);
                    calculo.mostrarMontoConvertido("COP", "USD", valorMontoBase);
                    break;

                default:
                    System.out.println("error no es una opcion valida");
                    break;
            }
        }
    }
}

