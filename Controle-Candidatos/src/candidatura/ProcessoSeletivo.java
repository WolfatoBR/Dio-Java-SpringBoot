package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Arthur", "Aysha", "Fabiane", "Percilia", "Luci", "Anderson", "Uedson"};
        for (String candidato : candidatos) {
            EntrandoContato(candidato);
        }
    }

    static void EntrandoContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = Atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("\nContato realizado com sucesso!");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com o candidato "+candidato+" na "+tentativasRealizadas+"ª tentativa.");
        }else{
            System.out.println("\nNão conseguimos contato com o candidato "+candidato+", número de tentativas realizadas: "+tentativasRealizadas);
        }
    }
    //metodo auxiliar de EntrandoContato
    static boolean Atender(){
        return new Random().nextInt(3)==1;
    }

    static void ImprimirSelecionado() {
        String[] candidatos = {"Arthur", "Aysha", "Fabiane", "Percilia", "Luci", "Anderson", "Uedson"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do candidato");

        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° "+(indice+1)+" é "+candidatos[indice]);
        }

        System.out.println("\nForma abreviada de interação (for each)");
        for(String candidato :candidatos){
            System.out.println("O candidato selecionado foi "+candidato);
        }
    }

    static void SelecaoCandidato() {
        String[] candidatos = {"Arthur", "Aysha", "Fabiane", "Percilia", "Luci", "Anderson", "Uedson"};

        int candidatosAtual = 0;
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido() {
        //metodo auxilar do SeleçãoCandidato
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void AnalisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra-proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}