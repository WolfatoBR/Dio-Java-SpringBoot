package enums;

public enum EstadosBrasileiros {
    SAO_PAULO ("SP","São Paulo",23),
    RIO_DE_JANEIRO ("RJ","Rio de Janeiro",15),
    PIAUI ("PI","Piaui",88),
    MARANHAO("MA","Maranhão",54),
    BAHIA("BA","Bahia",71);

    private String sigla;
    private String nome;
    private int ibge;

    EstadosBrasileiros(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
