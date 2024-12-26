package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        pegandoLancheCozinha();
        System.out.println("Serviu a mesa");
    }
    private void pegandoLancheCozinha(){
        System.out.println("Pegou o lancha na cozinha");
    }
    public void receberPagamento(){
        System.out.println("Recebendo o pagamento");
    }
    private void pegarPedidoBalcao(){
        System.out.println("Pegando o pedido no balcão");
    }
}
