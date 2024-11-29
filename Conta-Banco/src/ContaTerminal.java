import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        
        System.out.println("\n      === SEJA BEM-VINDO ===");
        System.out.printf("      Cliente: %s\n", nomeCliente);
        System.out.printf("      Agência: %s  Conta: %s\n", agencia, numeroConta);
        System.out.println("      =======================\n");

        String menu = """
                Digite qual a sua necessidade hoje:
                [d]  Depósito
                [s]  Saque
                [e]  Extrato
                [q]  Sair
                """;

        double saldo = 0;
        int LIMITE_SAQUE = 3;
        double limite = 500;
        String extrato = "";
        int numeroSaque = 0;

        while (true) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "d": // Depósito
                    System.out.print("Informe o valor do Depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        extrato += String.format("Depósito: R$ %.2f\n", valorDeposito);
                        System.out.println("Depósito realizado com sucesso!\n");
                    } else {
                        System.out.println("A operação falhou! O valor informado é inválido.\n");
                    }
                    break;

                case "s": // Saque
                    System.out.print("Informe o valor do Saque: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    boolean excedeuSaldo = valorSaque > saldo;
                    boolean excedeuLimite = valorSaque > limite;
                    boolean excedeuSaque = numeroSaque >= LIMITE_SAQUE;

                    if (excedeuSaldo) {
                        System.out.println("Operação falhou! Você não tem saldo suficiente.\n");
                    } else if (excedeuLimite) {
                        System.out.println("Operação falhou! Você excedeu o limite de saque.\n");
                    } else if (excedeuSaque) {
                        System.out.println("Operação falhou! Número máximo de saques já realizados.\n");
                    } else if (valorSaque > 0) {
                        saldo -= valorSaque;
                        extrato += String.format("Saque: R$ %.2f\n", valorSaque);
                        numeroSaque++;
                        System.out.println("Saque realizado com sucesso!\n");
                    } else {
                        System.out.println("Operação falhou! O valor informado é inválido.\n");
                    }
                    break;

                case "e": // Extrato
                    System.out.println("\n================ EXTRATO ================");
                    System.out.printf("Cliente: %s\n", nomeCliente);
                    System.out.printf("Agência: %s  Conta: %s\n", agencia, numeroConta);
                    if (extrato.isEmpty()) {
                        System.out.println("Não foram realizadas movimentações.");
                    } else {
                        System.out.println(extrato);
                    }
                    System.out.printf("\nSaldo: R$ %.2f\n", saldo);
                    System.out.println("==========================================");
                    break;

                case "q": // Sair
                    System.out.println("Obrigado por usar o nosso sistema. Até mais!");
                    return;

                default:
                    System.out.println("Operação inválida, por favor selecione novamente a operação desejada.\n");
                    break;
            }
        }
    }
}