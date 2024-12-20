package escola;

public class Escola {

    public static void main(String[] args) {
       Aluno aluno = new Aluno();
       aluno.setNome("Arthur");
       aluno.setIdade(20);
        System.out.println("Aluno: "+ aluno.getNome() + " tem " + aluno.getIdade() + " anos.");
    }
}
