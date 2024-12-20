package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos ingredientes");
    }
    private void controlarSaida(){
        System.out.println("Controlando a saida dos ingredientes");
    }
    void entregarIngredientes(){
        System.out.println("Entregando os ingredientes");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("Almoxarife trocando o gas");
    }
}
