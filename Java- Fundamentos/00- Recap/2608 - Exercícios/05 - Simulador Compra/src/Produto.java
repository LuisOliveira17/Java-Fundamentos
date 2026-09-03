public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(){

    }

    public Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listar(){
        System.out.println("quantidade = " + quantidade);
        System.out.println("nome = " + nome);
        System.out.println("preco = " + preco);
        System.out.println(" ");
    }


}
