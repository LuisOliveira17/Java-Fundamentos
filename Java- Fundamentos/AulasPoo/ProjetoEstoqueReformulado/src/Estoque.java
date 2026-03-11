import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    Produto produto = new Produto();
    public List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void imprimir(){
        for (Produto produto:produtos){
            produto.imprimir();
        }
    }

    public boolean gerarVenda(Produto produto, int quantidade){
        //Verificar se a quantidadeestoque negativo:
        if(produto.getQuantidadeProduto()-quantidade<0){
            System.out.println("QUANTIDADE INSUFICIENTE");
            return false;
        }
            int novaQuantidade=produto.getQuantidadeProduto()-quantidade;
            produto.setQuantidadeProduto(novaQuantidade);
            double valor;
            valor=quantidade*produto.getPrecoProduto();
            System.out.println("VENDA EXECUTADA!!!");
            System.out.printf("Valor: %.2f\n",valor);
    return true;
    }
}
