package model;

public class Dvd extends Produto{
    String diretor;

    public Dvd() {}

    public Dvd(String descricao, int estoqueDisponivel, double precoCusto,Double precoVenda, String diretor) {
        super(descricao, estoqueDisponivel, precoCusto, precoVenda);
        this.diretor = diretor;
    }

    @Override
    public void calcularPrecoVenda() {
        setPrecoVenda( getPrecoCusto());
    }

    public void calcularPrecoVeda(double cotacao) {
        setPrecoVenda(getPrecoCusto()*cotacao);
    }
}
