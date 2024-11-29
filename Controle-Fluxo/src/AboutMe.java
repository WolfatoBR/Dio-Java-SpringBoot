import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        try{
            Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome:");
        String nome= teclado.nextLine();

        System.out.println("Digite seu Sobrenome:");
        String sobrenome= teclado.nextLine();
        
        System.out.println("Digite sua idade:");
        int idade= teclado.nextInt();
        
        System.out.println("Digite sua altura:");
        double altura= teclado.nextDouble();
        
        teclado.close();

        System.out.println("Meu nome é "+nome.toUpperCase()+" "+sobrenome.toLowerCase());
        System.out.println("Tenho "+idade+" anos");
        System.out.println("E tenho "+altura+" de altura");
        }catch(InputMismatchException e){
            System.out.println(""" 
                 O campo: 
                 
                 Idade tem que ser Numerico.
                 Altura deve ser escrito utilizando " . "
            """);
        }

    }
}