package enums;

public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadosBrasileiros e: EstadosBrasileiros.values()){
           // System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.BAHIA;
        System.out.println(eb.getSigla() + " - " + eb.getNome());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
