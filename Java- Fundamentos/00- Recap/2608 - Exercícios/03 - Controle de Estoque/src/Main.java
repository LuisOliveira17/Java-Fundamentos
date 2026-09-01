import java.util.PrimitiveIterator;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 10,100);

        produto.adicionarEstoque(-10);
        produto.mostrarInfo();
        produto.gerarVenda();
        produto.mostrarInfo();

    }
}
