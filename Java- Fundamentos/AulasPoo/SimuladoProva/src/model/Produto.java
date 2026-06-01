package model;

import exception.EstoqueInsuficienteException;

public abstract class Produto {
    private String descricao;
    private double precoCusto;
    private int estoqueDisponivel;
    private double precoVenda;

    public Produto(){
    }

    public Produto(String descricao, int estoqueDisponivel, double precoCusto, double precoVenda) {
        this.descricao = descricao;
        this.estoqueDisponivel = estoqueDisponivel;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public abstract void calcularPrecoVenda();

    public void exibirDados(){
        System.out.println("descricao = " + descricao);
        System.out.println("precoCusto = " + precoCusto);
        System.out.println("estoqueDisponivel = " + estoqueDisponivel);
        System.out.println("precoVenda = " + precoVenda);
    }

    public void vender(int qtd) throws EstoqueInsuficienteException{
        if(qtd>estoqueDisponivel){
            throw new EstoqueInsuficienteException();
        }
        estoqueDisponivel-=qtd;
        System.out.println("Venda realizada com sucesso!!!!!");
    }
}
