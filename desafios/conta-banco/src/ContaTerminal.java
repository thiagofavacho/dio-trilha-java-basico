import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String nomeCliente, agencia;
        int numero;
        double saldo;

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência:" );
        agencia = scan.next();

        System.out.println("Por favor, digite o número de sua Conta:");
        numero = scan.nextInt();
        String contaEmString = String.valueOf(numero);

        System.out.println("Por favor, digite seu saldo:");
        saldo = scan.nextDouble();
        String saldoEmString = String.valueOf(saldo);

        String contaCriada = "\nOlá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é: ").concat(agencia).concat(", conta: ").concat(contaEmString).concat(" e seu saldo é de: R$ ").concat(saldoEmString).concat(" e já está disponível para saque.\n\n");
        System.out.println(contaCriada);
    }
}