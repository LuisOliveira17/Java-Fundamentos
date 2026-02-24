public class Conta {
    private double balanco;

    public void conta(double balancoinicial){
        if(balancoinicial>0.0){
            balanco=balancoinicial;
        }
    }

    public void credito(double quantia){
        balanco+=quantia;
    }

    public double getBalanco(){
        return balanco;
    }
}
