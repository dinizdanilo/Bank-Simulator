package application;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args ) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = sc.nextLine();

        System.out.print("Deseja fazer um depósito inicial (s/n)? ");
        String deposito = sc.nextLine().trim().toLowerCase();

        ContaBancaria conta;
        if (deposito.equals("s")) {
            System.out.print("Digite o valor de depósito inicial: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            conta = new ContaBancaria(numeroConta, titular, valor);
        }
        else {
            conta = new ContaBancaria(numeroConta, titular);
        }

        System.out.print(conta + "\n");

        do {
            System.out.print("\nDeseja fazer um depósito adicional (s/n)? ");
            deposito = sc.nextLine().trim().toLowerCase();
            if (deposito.equals("n")) {
                break;
            }

            System.out.print("\nDigite o valor do depósito: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            conta.deposito(valor);

        } while (deposito.equals("s"));

        System.out.print(conta);

        sc.close();
    }
}
