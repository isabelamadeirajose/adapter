public class PainelClima {
    private PrevisaoService servico;

    public PainelClima(PrevisaoService servico) {
        this.servico = servico;
    }

    public void exibir(String cidade) {
        int temperatura = servico.obterTemperatura(cidade);
        System.out.println("Temperatura em " + cidade + ": " + temperatura + "°C");
    }
}