abstract class FormaGeometrica {

    private String nome;
    public abstract void calcularArea();

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String  getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
