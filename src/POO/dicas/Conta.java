package dicas;

public class Conta {

    private String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor deve ser maior do que zero!");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " +saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " +saldo);
        } else {
            System.out.println("Valor deve ser maior do que zero!");
        }
    }
}
