package apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente as classes filha conhecem esse metodo
    protected void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a Internet");
    }
}