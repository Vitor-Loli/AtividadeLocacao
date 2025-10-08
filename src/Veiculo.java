import java.time.LocalDate;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double valorDiaria;
    private boolean alocado;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Veiculo(String marca, String modelo, int ano, double valorDiaria, boolean alocado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.alocado = alocado;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public boolean getAlocado() {
        return alocado;
    }
    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public abstract double calcularValor(long dias);
    public abstract String exibirInfo();

}
