public class ContBancaria {
    private String numConta;
    private String titular;
    private double saldo;

    public ContBancaria(String numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void depositar(double valorSaldo){
        if(valorSaldo<=0){
            System.out.println("Valor de depósito inválido!!!");
        }
        else{
            this.saldo+=valorSaldo;
            System.out.println("SALDO ADICIONADO");
        }
    }

    public void sacar(double valorSaque){
        if(valorSaque>saldo || valorSaque<0){
            System.out.println("Valor de saque invalido!!!!!");
        }
        else{
            saldo -= valorSaque;
            System.out.println("SALDO SACADO");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: "+getSaldo());
    }
}
