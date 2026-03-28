package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private boolean mensalista;
    public List<Veiculo>veiculoCliente;

    public Cliente(String nome,String cpf, boolean mensalista){
        this.nome=nome;
        this.cpf=cpf;
        this.mensalista=mensalista;
        this.veiculoCliente = new ArrayList<>();
    }

    public Cliente(){

    }
    public boolean isMensalista(){
        return mensalista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMensalista(boolean mensalista) {
        this.mensalista = mensalista;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarVeiculo(Veiculo veiculo){
        this.veiculoCliente.add(veiculo);
    }
    public List<Veiculo> getVeiculoCliente() {
        return veiculoCliente;
    }

    public void listar(){
        System.out.println("nome = " + nome);
        System.out.println("cpf = " + cpf);
        System.out.println("mensalista = " + mensalista);
        System.out.println("veiculoCliente = " + veiculoCliente);

    }

}
