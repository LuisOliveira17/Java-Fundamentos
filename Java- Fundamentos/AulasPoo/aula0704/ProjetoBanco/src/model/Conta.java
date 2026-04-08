package model;

public abstract class Conta {
    private int  numConta;
    private String nomeCliente;
    private String nomeAgencia;
    protected double saldo;

    public Conta(){
    }

    public Conta(int numConta, String nomeCliente, String nomeAgencia){
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.nomeAgencia = nomeAgencia;
        this.saldo = 0.0;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void depositar(double valor) throws IllegalAccessException {
        if(valor > 0){
            this.saldo += valor;
        }else{
            throw new IllegalAccessException("Erro de valor");
        }
    }

    public void sacar(double valor) throws IllegalAccessException {
        if(valor<=saldo){
            this.saldo -= valor;
        }else {
            throw new IllegalAccessException("Sem saldo para saque");
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id:").append(this.numConta).append("\n");
        sb.append("Nome:").append(this.nomeCliente).append("\n");
        sb.append("Saldo:").append(this.saldo).append("\n");
        return sb.toString();
    }
}
