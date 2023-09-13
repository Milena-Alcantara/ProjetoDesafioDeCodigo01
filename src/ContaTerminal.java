
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("Por favor, insira o número de sua conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, informe sua agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Por favor, informe o seu nome: ");
        String nomeCliente = scanner.nextLine();

        double saldo = 10.0;

        System.out.println("Olá "+nomeCliente+", " +
                "obrigado por criar uma conta em nosso banco, sua agência é " +agencia+
                ",conta "+numeroConta+" " +
                "e seu saldo R$ "+saldo+" já esta disponível para saque.");
    }
}