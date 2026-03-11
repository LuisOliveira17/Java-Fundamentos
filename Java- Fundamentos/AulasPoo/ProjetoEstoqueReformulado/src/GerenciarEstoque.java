import java.util.Scanner;
public class GerenciarEstoque {
    static Estoque estoque = new Estoque();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=0;

        do{
            System.out.println("\n1.Cadastrar");
            System.out.println("2.Listar");
            System.out.println("3.Venda");
            System.out.println("4.Sair");
            System.out.println("-------------------");
            System.out.println("Escolha:");
            op=sc.nextInt();

            switch (op){
                case 1->execCadastro();
                case 2->execListar();
                case 3->execGerarVenda();
            }
        }while(op!=4);

    }

    public static void execCadastro(){
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("ID:");
        produto.setIdProduto(sc.nextLine()); // Chamo a variável Set passando o parametro de input;

        System.out.println("Nome:");
        produto.setNomeProduto(sc.nextLine());

        System.out.println("Quantidade:");
        produto.setQuantidadeProduto(Integer.parseInt(sc.nextLine()));

        System.out.println("Preco:");
        produto.setPrecoProduto(Double.parseDouble(sc.nextLine()));

        estoque.adicionarProduto(produto);
    }

    public static void execListar(){
        estoque.imprimir();
    }

    public static void execGerarVenda(){
        Scanner sc = new Scanner(System.in);
        Produto produtoAchado= new Produto();
        int pos, quant;
        boolean vendaRealizada;
        System.out.println("Digite a posicao do produto:");
        pos=Integer.parseInt(sc.nextLine());

        produtoAchado=estoque.produtos.get(pos); // Acha o produto dentro da lista e a quantidade

        do{
            System.out.println("\nDigite a quantidade:");
            quant=Integer.parseInt(sc.nextLine());

            vendaRealizada = estoque.gerarVenda(produtoAchado, quant);
          }while(!vendaRealizada);

        // A ideia é não deixar nenhum input na clase de Estoque. Apenas essa terá interações com usuários
    }
    }





