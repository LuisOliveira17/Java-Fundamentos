package model;

public class Poupanca extends Conta{
    private double taxaRendimento;

    public Poupanca(){

    }

    public Poupanca(int numConta,String nomeAgencia,String nomeCliente,double taxaRendimento){
        super(numConta,nomeAgencia,nomeCliente);
        this.taxaRendimento=taxaRendimento;
    }
}
