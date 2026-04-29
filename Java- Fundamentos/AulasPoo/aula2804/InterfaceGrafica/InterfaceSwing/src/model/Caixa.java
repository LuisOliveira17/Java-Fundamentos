package model;

public class Caixa {
    private double saldo;

    public void sacar(double valor) {
        if(valor <= saldo) {
            this.saldo -= valor;
        }else{
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
        }else{
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
