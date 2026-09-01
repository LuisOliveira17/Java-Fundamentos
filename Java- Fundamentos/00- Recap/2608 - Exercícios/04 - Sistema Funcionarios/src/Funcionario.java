public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(float porcentagem){ //Em porcentagem
        this.salario += salario * (porcentagem/100);
    }

    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("cargo = " + cargo);
        System.out.println("salario = " + salario);
    }

}
