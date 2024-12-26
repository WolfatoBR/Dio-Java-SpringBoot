package lanchonete.area.cliente;

public class Cliente {
    public void escolherPedido(){
        System.out.println("Cliente escolhendo pedido");
    }
    public void fazerPedido(){
        System.out.println("Cliente fazendo pedido");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Cliente pagando a conta");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("Cliente consultando saldo do aplicativo");
    }
}
