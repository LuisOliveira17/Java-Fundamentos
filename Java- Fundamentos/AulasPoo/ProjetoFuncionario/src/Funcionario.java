public class Funcionario {
    private String departamento;
    private double salario;
    private String rg;
    private String nome;
    private boolean ativo;

    public void bonificar(double valor){
        salario+=valor;
    }

    public String listar(){
        return "\n-------------------------"+
                "\nNome:"+nome+
                "\nSalario:"+salario+
                "\nRG:"+rg+
                "\nDepartamento:"+departamento+
                "\nAtivo:"+ativo+
                "\n-----------------------";
    }

    public void setDepartamento(String dep){
        this.departamento=dep; //this se refere ao objeto de instancia
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setRg(String rg){
        this.rg=rg;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setAtivo(boolean ativo){
        this.ativo= ativo;
    }

    public String getRgFuncionario(){
        return rg;
    }

}
