package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Arthur", "123.456.789-00");
        pessoa.setEndereco("Rua das graça");
        System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
    }
}
