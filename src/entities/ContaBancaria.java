package entities;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }
}
