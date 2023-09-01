import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Para iniciarmos sua consulta com toda segurança, gostaria de confirmar algumas informações.");

Scanner scanner = new Scanner(System.in);

        // Solicitar informações ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        // Fechar o scanner
        scanner.close();

        // Exibir mensagem com informações inseridas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    }

