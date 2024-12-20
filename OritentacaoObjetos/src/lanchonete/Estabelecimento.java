package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro=new Cozinheiro();
        //ações que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarcomboNoBalcao();

        Atendente atendente=new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente=new Cliente();
        cliente.escolherPedido();
        cliente.fazerPedido();
        cliente.pagarConta();


    }
}
