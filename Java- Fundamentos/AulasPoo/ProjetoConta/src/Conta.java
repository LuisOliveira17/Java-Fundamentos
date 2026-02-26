public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public int sacar(double valorSaque){
        if(saldo<valorSaque||saldo==0){
            return 0;
        }
        return 1;
    }

    public void depositar(double valorRecebido){
        saldo+=valorRecebido;
    }

    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nomeCliente = " + nomeCliente);    
    }


}


