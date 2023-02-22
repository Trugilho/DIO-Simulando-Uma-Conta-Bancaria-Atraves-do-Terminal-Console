import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da sua conta:");
        numeroConta = sc.nextInt();
        
        System.out.println("Por favor, digite o número da sua Agência!");
        agencia = sc.next();

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = sc.next();

        System.out.println("Por favor digite seu saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por abrir uma conta em nosso banco, sua agência é " + agencia +", " + "sua conta é " + numeroConta + " e seu saldo é R$ " + saldo + " e está disponível para saque!");
    }
}