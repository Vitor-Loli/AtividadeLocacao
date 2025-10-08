import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int opc = 0;
        String marca;
        String modelo;
        int ano;
        int tipo;
        int qtdPortas;
        String cambio;
        int cilindrada;
        double capacidade;
        Teclado teclado = new Teclado();
        Locacao locacao = new Locacao();
        do{
            System.out.println("\nMENU\n");
            System.out.println("[1] - Cadastrar Veículo");
            System.out.println("[2] - Alocar Veículo");
            System.out.println("[3] - Desalocar Veículo");
            System.out.println("[4] - Calcular Diárias");
            System.out.println("[5] - Exibir Veículos Alocados");
            System.out.println("[6] - Exibir Veículos Disponíveis");
            System.out.println("[7] - Exibir Informações dos Veículos");
            System.out.println("[8] - Sair");
            opc = teclado.readInt("Informe a opção desejada:");

            switch(opc){
                case 1:
                    marca = teclado.readString("Informe a marca do veículo: ");
                    modelo = teclado.readString("Informe o modelo do veículo: ");
                    ano = teclado.readInt("Informe o ano do veículo: ");
                    tipo = teclado.readInt("Informe o tipo do veículo: \n[1] - Carro\n[2] - Motocicleta\n[3] - Caminhão\n");

                    switch(tipo){
                        case 1:
                            qtdPortas = teclado.readInt("Informe a quantidade de portas: ");
                            cambio = teclado.readString("Informe o câmbio do Carro: Ex Automático");
                            locacao.cadastrarVeiculo(new Carro(marca, modelo, ano, 150, false, qtdPortas, cambio));
                            break;
                        case 2:
                            cilindrada = teclado.readInt("Informe a cilindrada da Motocicleta: ");
                            locacao.cadastrarVeiculo(new Motocicleta(marca, modelo, ano, 50, false, cilindrada));
                            break;
                        case 3:
                            capacidade = teclado.readDouble("Informe a capacidade de carga do Caminhão: ");
                            locacao.cadastrarVeiculo(new Caminhao(marca, modelo, ano, 300, false, capacidade));
                            break;
                        default:
                            System.out.println("Opção inválida!\n");
                    }
                    break;
                case 2:
                    if (locacao.exebirVeiculos()){
                        System.out.println("Não há veículos cadastrados/disponíveis!");
                    }else{
                        locacao.alocarVeiculo(teclado.readInt("Informe o veículo que deseja alocar: "));
                    }

                    break;
                case 3:
                    if(locacao.exebirAlocados()){
                        System.out.println("Não há veículos cadastrados/alocados!");
                    }else{
                        double valor = locacao.desalocarVeiculo(teclado.readInt("Informe o veículo que deseja desalocar: "));
                        System.out.println("Total da diária do veículo: " + valor);
                    }

                    break;
                case 4:
                    if(locacao.exebirDiarias()){
                        System.out.println("Não há veículos cadastrados/alocados!");
                    }
                    break;
                case 5:
                    if(locacao.exebirAlocados()){
                        System.out.println("Não há veículos cadastrados/alocados!");
                    }
                    break;
                case 6:
                    if (locacao.exebirVeiculos() ){
                        System.out.println("Não há veículos cadastrados/disponíveis!");
                    }
                    break;
                case 7:
                    if (locacao.exebirInfos() ){
                        System.out.println("Não há veículos cadastrados/disponíveis!");
                    }
                    break;
                case 8:
                    System.out.println("Até logo!");
                    break;
                    default:
                        System.out.println("Opção inválida");

            }
        }while(opc!= 8);
    }
}