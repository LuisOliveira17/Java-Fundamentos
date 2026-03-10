import java.util.ArrayList;
import java.util.List;

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
}
