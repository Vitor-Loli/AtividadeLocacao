public class Motocicleta extends Veiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int ano, double valorDiaria, boolean alocado, int cilindrada) {
        super(marca, modelo, ano, valorDiaria, alocado);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override

    public String exibirInfo() {
        return "Marca: " + getMarca()+ ", Modelo: " + getModelo()+", Ano: " + getAno() + ", Cilindrada: " + this.cilindrada +  ", Disponível: " + (getAlocado()? "Não": "Sim") + ", Valor da Diária: R$" + getValorDiaria();
    }


    public double calcularValor(long dias){
        return getValorDiaria() * dias;
    }
}
