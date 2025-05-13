# 💱 Conversor de Monedas

Este proyecto es una aplicación de consola en Java que permite convertir montos entre distintas monedas utilizando tasas de cambio en tiempo real.

## 🚀 Funcionalidades

- Conversión de Dólar estadounidense a:
    - Peso argentino 🇦🇷
    - Real brasileño 🇧🇷
    - Peso colombiano 🇨🇴
- Conversión desde esas monedas de vuelta a Dólar
- Menú interactivo en consola
- Consulta de tasas de cambio mediante API externa
- Diseño orientado a objetos aplicando el principio de responsabilidad única

## 🛠️ Tecnologías

- Java 17+
- [ExchangeRate-API](https://www.exchangerate-api.com/) (o una API compatible para tasas de cambio)
- Gradle o Maven (opcional, si decides gestionarlo con un sistema de construcción)

## 📁 Estructura del proyecto

    lab.com.alura.conversordemoneda/
    ├── api/
    │ └── ExchangeRateAPI.java
    ├── calculos/
    │ ├── CalculadoraDeMonedas.java
    │ └── FiltroDeMonedas.java
    ├── modelos/
    │ └── Conversor.java
    └── principal/
    └── ConversorApp.java

## ▶️ Cómo ejecutar

1. Clona el repositorio:

```bash
git clone https://github.com/Cristhian0000/conversor-de-monedas.git
cd conversor-de-monedas