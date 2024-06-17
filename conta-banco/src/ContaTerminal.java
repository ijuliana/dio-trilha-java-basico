import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Por favor, digite o numero da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // Solicita e lê a agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

         // Solicita e lê o nome do cliente
         System.out.println("Por favor, digite o nome do cliente:");
         String nomeCliente = scanner.nextLine();

         // Solicita e lê o saldo inicial
        System.out.println("Por favor, digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();

        // Monta a mensagem de saída
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        // Exibe a mensagem com as informações da conta
        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();

    }
}
