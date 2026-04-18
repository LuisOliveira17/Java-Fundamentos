package model;

public class Corrente extends Conta{
    private double limite;

    public Corrente(){

    }
    public Corrente(int numConta,String nomeAgencia,String nomeCliente,double limite){
        super(numConta,nomeAgencia,nomeCliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) throws IllegalAccessException {
        if(valor<=(getSaldo()-limite)){
            saldo-=(valor-(valor*cobrarTaxaSaque()));
        }else{
            throw new IllegalAccessException("Sem saldo ou limite");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(super.toString());
        sb.append("Limite:").append(this.limite).append("\n");
        return  sb.toString();
    }

    @Override
    double cobrarTaxaSaque() {
        return 0.10;
    }
}
