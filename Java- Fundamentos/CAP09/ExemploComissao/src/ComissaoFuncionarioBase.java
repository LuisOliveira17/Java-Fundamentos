public class ComissaoFuncionarioBase extends ComissaoFuncionario {

    private double salarioBase;

    public ComissaoFuncionarioBase(String nome,String sobrenome, String cpf, double vendasBrutas, double taxaComissao,double salarioBase) {
        super(nome,sobrenome,cpf,vendasBrutas,taxaComissao);
        this.salarioBase=salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws IllegalAccessException {
        if(salarioBase>=0){
            this.salarioBase=salarioBase;
        }else throw new IllegalAccessException("Salario base deve ser > 0");

    }

    @Override
    public double ganhos() {
        return salarioBase+(super.ganhos());
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(super.toString());
        str.append("\nSalario Base: "+getSalarioBase());
        str.append("\nSalario + Comissoes:"+ganhos());
        return str.toString();
    }
}
