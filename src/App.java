import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");

        String nome = sc.next();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println("Digite a operação que deseja realizar: ");
        System.out.printf("1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Imprimir extrato\n");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor deseja depositar: ");
                double depositar = sc.nextDouble();
                cc.depositar(depositar);

            case 2:
                System.out.println("Digite o valor deseja sacar: ");
                double saque = sc.nextDouble();
                cc.sacar(saque);

            case 3:
                System.out.println("Digite o valor deseja transferir: ");
                double transferir = sc.nextDouble();
                cc.transferir(transferir, poupanca);

            case 4:
                cc.imprimirExtrato();
                poupanca.imprimirExtrato();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close();
    }
}
