package model;

public class Livro extends Produto{
    String autor;

    public Livro(){
    }

    public Livro(String descricao, int estoqueDisponivel, double precoCusto, String autor, Double precoVenda) {
      super(descricao, estoqueDisponivel, precoCusto, precoVenda);
      this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void calcularPrecoVenda() {
        setPrecoVenda(getPrecoCusto()*1.15);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("autor = " + autor);
    }
}
