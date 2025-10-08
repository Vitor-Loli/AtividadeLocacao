public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double valorDiaria, boolean alocado, double capacidadeCarga) {
        super(marca, modelo, ano, valorDiaria, alocado);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String exibirInfo() {
        return "Marca: " + getMarca()+ ", Modelo: " + getModelo()+", Ano: " + getAno() + ", Capacidade da carga: " + this.capacidadeCarga + ", Disponível: " + (getAlocado()? "Não": "Sim") + ", Valor da Diária: R$" + getValorDiaria();
    }

    public double calcularValor(long dias) {
        return getValorDiaria() * dias;
    }
}
