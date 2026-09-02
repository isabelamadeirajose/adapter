public class Main {
    public static void main(String[] args) {
        // Usando o fornecedor OpenWeather
        PrevisaoService openWeather = new OpenWeatherAdapter(new OpenWeatherApi());
        PainelClima painel1 = new PainelClima(openWeather);
        painel1.exibir("Criciúma");

        // Usando o fornecedor AccuWeather
        PrevisaoService accuWeather = new AccuWeatherAdapter(new AccuWeatherApi());
        PainelClima painel2 = new PainelClima(accuWeather);
        painel2.exibir("Criciúma");
    }
}