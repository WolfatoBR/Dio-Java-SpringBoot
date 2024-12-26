package exemploInterface.equipamentos.multifuncional;

import exemploInterface.equipamentos.copiadora.Copiadora;
import exemploInterface.equipamentos.digitalizadora.Digitalizadora;
import exemploInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultFunc implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("copiando via equipamento multifuncional");
    }
    public void digitalizar() {
        System.out.println("digitalizando via equipamento multifuncional");
    }
    public void imprimir() {
        System.out.println("imprimindo via equipamento multifuncional");
    }
}