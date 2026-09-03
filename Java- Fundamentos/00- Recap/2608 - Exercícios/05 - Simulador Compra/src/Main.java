import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Produto> carrinho = new ArrayList<>();
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int resp = 0;

        do{
            System.out.println("------------------");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Calcular Total");
            System.out.println("4 - Sair");
            System.out.println("------------------");
            System.out.println("Resposta:");
            resp = (Integer.parseInt(input.nextLine()));

            switch (resp){
                case 1 -> adicionarProduto();
                case 2 -> listarProduto();
                case 3 -> calcularTotal();
                case 4 -> System.out.println("FIM");

            }

        }while(resp!=4);

    }

    public static void adicionarProduto(){
        Produto produto = new Produto();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome:");
        produto.setNome(input.nextLine());

        System.out.println("Digite quantidade:");
        produto.setQuantidade(Integer.parseInt(input.nextLine()));

        System.out.println("Digite o preco:");
        produto.setPreco(Double.parseDouble(input.nextLine()));

        carrinho.add(produto);
        System.out.println("Produto Adicionado com sucesso!!!");
    }

    public static void listarProduto(){
        for( Produto produto: carrinho){
            produto.listar();
        }
    }

    public static void calcularTotal(){
        int quantItens=0;
        double precoTotal=0;

        for(Produto produto: carrinho){
            precoTotal+=(produto.getPreco()*produto.getQuantidade());
            quantItens++;
        }

        System.out.println("Total de itens:"+quantItens);
        System.out.println("Total:R$"+precoTotal);
    }
}


