import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    //Encapsulamento: esconder os detalhes internos de uma classe e expor apenas o necessário.
    //Herança: Permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse).
    //Abstração: Foca apenas nos detalhes relevantes de um objeto e oculta complexidades.
    //Polimorfismo: Permite que métodos com o mesmo nome se comportem de maneiras diferentes, dependendo do contexto.

    public static void main(String[] args) {
        ServicoMensagemInstantanea smi=null;

        String appEscolhido="fbm";

        if(appEscolhido.equals("msn")){
            smi=new MSNMessenger();
        }else if(appEscolhido.equals("fbm")){
            smi=new FacebookMessenger();
        }else if(appEscolhido.equals("tlg")){
            smi=new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}