import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        System.out.println("Olá! Para iniciarmos sua consulta com toda segurança, gostaria de confirmar algumas informações.");

        // Declaração e obtenção das variáveis
        String numeroConta = "1021";
        String nomeCliente = "MARIO ANDRADE";
        String agencia = "067-8";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);
        // Solicitar informações ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Número da Conta:");
        numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        saldo = Double.parseDouble(scanner.nextLine());

        // Fechar o scanner
        scanner.close();

        // Exibir mensagem com informações inseridas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}