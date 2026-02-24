public class Operacoes {
    private float n1;
    private float n2;
    private String opr;

    public void setN1(float num1){
        n1=num1;
    }

    public void setN2(float num2){
        n2=num2;
    }

    public void setOpr(String opracao){
        opr=opracao;
    }

    public float soma(){
        return n1+n2;
    }

    public float subtracao(){
        return n1-n2;
    }

    public float divisao(){
        return n1/n2;
    }

    public float mult(){
        return n1*n2;
    }
}
