import java.awt.event.WindowFocusListener;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    Scanner input = new Scanner(System.in);

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade<0){
            System.out.println("Quantidade Invalida!!!");
        }else{
            this.quantidade += quantidade;
            System.out.println("Estoque adicionado com sucesso!!!");
            System.out.printf("Quantidade nova:%d",this.quantidade);
        }
    }

    public void gerarVenda(){
        int quantVenda = 0;
        System.out.println("Digite a quantidade da venda:");
        quantVenda = input.nextInt();

        if(quantVenda<0){
            System.out.println("Quantidade para venda nao pode ser negativo");

        } else if(quantVenda>quantidade){
            System.out.println("Quantidade insuficiente no estoque");
        }else{
            this.quantidade -= quantVenda;
            System.out.println("-----------------------");
            System.out.println("Quantidade de itens:"+quantVenda);
            System.out.println("Valor Total:"+(quantVenda*preco));
            System.out.println("OBRIGADO PELA PREFERENCIA!!!!!");
            System.out.println("-----------------------");
        }

    }

    public void mostrarInfo(){
        System.out.println("-----------------------");

        System.out.println("nome = " + nome);
        System.out.println("preco = " + preco);
        System.out.println("quantidade = " + quantidade);
        System.out.println("-----------------------");

    }
}
