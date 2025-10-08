public class Carro extends Veiculo {
    private int qtdPortas;
    private String cambio;

    public  Carro(String marca, String modelo, int ano, double valorDiaria, boolean alocado, int qtdPortas, String cambio) {
        super(marca, modelo, ano, valorDiaria, alocado);
        this.qtdPortas = qtdPortas;
        this.cambio = cambio;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    public String getCambio() {
        return cambio;
    }
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    @Override
    public String exibirInfo() {
        return "Marca: " + getMarca()+ ", Modelo: " + getModelo()+", Ano: " + getAno() + ", Quantidade de Portas: " + this.qtdPortas + ", Câmbio: " + this.cambio + ", Disponível: " + (getAlocado()? "Não": "Sim") + ", Valor da Diária: R$" + getValorDiaria();
    }

    public double calcularValor(long dias) {
        return getValorDiaria() * dias;
    }
}
