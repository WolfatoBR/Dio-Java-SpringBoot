package exemploInterface.estabelecimento;

import exemploInterface.equipamentos.copiadora.Copiadora;
import exemploInterface.equipamentos.digitalizadora.Digitalizadora;
import exemploInterface.equipamentos.impressora.Deskjet;
import exemploInterface.equipamentos.impressora.Impressora;
import exemploInterface.equipamentos.impressora.LaserJet;
import exemploInterface.equipamentos.multifuncional.EquipamentoMultFunc;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultFunc em = new EquipamentoMultFunc();

        Impressora impressora=em;
        Digitalizadora digitalizadora=em;
        Copiadora copiadora=em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
