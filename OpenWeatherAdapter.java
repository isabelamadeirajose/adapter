public class OpenWeatherAdapter implements PrevisaoService {
    private OpenWeatherApi api;

    public OpenWeatherAdapter(OpenWeatherApi api) {
        this.api = api;
    }

    @Override
    public int obterTemperatura(String cidade) {
        double celsius = api.temperatura(cidade);
        return (int) celsius;
    }
}