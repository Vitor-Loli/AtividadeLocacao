import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

 class Locacao {

     List<Veiculo> veiculos = new ArrayList<>();

     public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
     }

     public void alocarVeiculo(int veiculo) {
         if (veiculo < 0 || veiculo >= veiculos.size()) {
             System.out.println("Opção inválida!");
         }else{
             veiculos.get(veiculo).setAlocado(true);
             veiculos.get(veiculo).setDataInicio(LocalDate.now());
         }

     }

     public double desalocarVeiculo(int veiculo) {
         if (veiculo < 0 || veiculo >= veiculos.size()) {
             System.out.println("Opção inválida!");
         } else {
             veiculos.get(veiculo).setAlocado(false);
             veiculos.get(veiculo).setDataFim(LocalDate.now());
             return calcularValorLocacao(veiculo);
         }
         return 0;
     }

     public double calcularValorLocacao(int veiculo) {
         long dias;
         if(veiculos.get(veiculo).getDataFim() == null){
             dias = ChronoUnit.DAYS.between(veiculos.get(veiculo).getDataInicio(), LocalDate.now());
         }else{
             dias = ChronoUnit.DAYS.between(veiculos.get(veiculo).getDataInicio(), veiculos.get(veiculo).getDataFim());
         }

         if(dias == 0){
             dias = 1;
         }
         return veiculos.get(veiculo).calcularValor(dias);
     }

     public boolean exebirDiarias(){
         if(veiculos.isEmpty()){
             return true;
         }else{
             boolean flag = true;
             for  (int i = 0; i < veiculos.size(); i++) {
                 if(veiculos.get(i).getAlocado()){
                     System.out.println("["+i+"]" + " - " + veiculos.get(i).getMarca() + " "  + veiculos.get(i).getModelo() + " - "  + veiculos.get(i).getAno() + " R$" + calcularValorLocacao(i));
                     flag = false;
                 }
             }
             return flag;
         }
     }

     public boolean exebirAlocados(){
         if(veiculos.isEmpty()){
             return true;
         }else{
             boolean flag = true;
             for  (int i = 0; i < veiculos.size(); i++) {
                 if(veiculos.get(i).getAlocado()){
                     System.out.println("["+i+"]" + " - " + veiculos.get(i).getMarca() + " "  + veiculos.get(i).getModelo() + " - "  + veiculos.get(i).getAno());
                     flag = false;
                 }
             }
             return flag;
         }

     }

     public boolean exebirVeiculos(){
         if(veiculos.isEmpty()){
             return true;
         }else{
             boolean flag = true;
             for  (int i = 0; i < veiculos.size(); i++) {
                 if(!veiculos.get(i).getAlocado()){
                     System.out.println("["+i+"]" + " - " + veiculos.get(i).getMarca() + " "  + veiculos.get(i).getModelo() + " - "  + veiculos.get(i).getAno());
                     flag = false;
                 }
             }
             return flag;
         }

     }

     public boolean exebirInfos(){
         if(veiculos.isEmpty()){
             return true;
         }else{
             for (int i = 0; i < veiculos.size(); i++) {
                 System.out.println((i + 1) + " - " + veiculos.get(i).exibirInfo());
             }
             return false;
         }
     }


}
