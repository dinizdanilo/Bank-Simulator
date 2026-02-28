package entities;

public class ContaBancaria {

    private static final double TAXA_SAQUE = 5.00;

    private final int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }
    public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
        this(numeroConta, titular);
        if (depositoInicial > 0) {
            deposito(depositoInicial);
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
         if (valor > 0.0) {
             this.saldo += valor;
         }
    }

}