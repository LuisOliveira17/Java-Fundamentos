import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoTeste {
    static Produto prod = new Produto();

    // Declara uma lista pública e estática chamada "produtos"
    // Essa lista só pode armazenar objetos do tipo Produto
    // Ela começa vazia e será usada para guardar todos os produtos cadastrados
    public static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ProdutoTeste prodTeste= new ProdutoTeste();

        int opcao=0;
        do{
            System.out.println("==================");
            System.out.println("1.Cadastrar");
            System.out.println("2.Entrada Estoque");
            System.out.println("3.Venda (saida)");
            System.out.println("4.Consultar");
            System.out.println("5.Sair");
            System.out.println("==================");
            System.out.println("Escolha:");
            opcao=Integer.parseInt(input.nextLine());

            switch (opcao){
                case 1->execCadastrar();
                case 2->execEntrada();
                case 3->execDarBaixa();
                case 4->execImprimir();
                case 5-> System.out.println("FIM DO PROGRAMA");
                default -> System.out.println("Opcao invalida");
            }


        }while(opcao!=5);
    }

    public static void  execCadastrar(){
        Scanner sc =  new Scanner(System.in);
        String opcao;
        do {
            Produto produto = new Produto(); //Cria um novo produto independente para poder cadastrar na lista e puxar com id
            System.out.println("Digite id produto:");
            produto.idProduto = Integer.parseInt(sc.nextLine());


            System.out.println("Digite nome produto:");
            produto.nome = sc.nextLine();

            System.out.println("Digite o preco:");
            produto.preco = Double.parseDouble(sc.nextLine());

            //Adiciona o produto à lista de produtos
            produtos.add(produto);

            //Loop para decidir se quer adiiconar mais produtos à lista:
            do {
                System.out.println("Deseja adicionar mais um produto? (s/n):");
                opcao = sc.nextLine();
                if (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n")) {
                    System.out.println("DIGITE UM VALOR VALIDO:");
                }
            } while (!opcao.equalsIgnoreCase("s") && !opcao.equalsIgnoreCase("n"));
        }while(opcao.equalsIgnoreCase("s"));
    }

    public static void execDarBaixa(){
        Scanner sc =  new Scanner(System.in);
        Produto produtoEncontrado = new Produto();
        produtoEncontrado = null;
        int id;
        int quantidade=0;
        do {

            System.out.println("Digite o id do produto a ser vendido:");
            id = Integer.parseInt(sc.nextLine());
            for(Produto produto: produtos){
                if(produto.idProduto==id){
                    produtoEncontrado=produto;
                }
            }

            if(produtoEncontrado==null){
                System.out.println("PRODUTO NAO ENCONTRADO");
            }
            System.out.println("Digite a quantidade vendida:");
            quantidade=Integer.parseInt(sc.nextLine());

            if((produtoEncontrado.quantidade)-quantidade==0||(produtoEncontrado.quantidade)-quantidade<0){
                System.out.println("\nQuantidade ira zerar ou negativar. Tente novamente");
            }
            if (quantidade<0) System.out.println("Digite um valor valido:");

        }while (quantidade<0||produtoEncontrado.quantidade-quantidade<=0); //Não deixa o estoque zerar ou ficar negativo
      boolean status=  produtoEncontrado.darBaixa(quantidade);

      if(status){
          System.out.println("VENDA REALIZADA");
      }else {
          System.out.println("ERRO DE VENDA");
      }
    }
    public static void execImprimir(){
        for(Produto produto: produtos){ // Para cada Produto dentro da lista produtos, a variável "produto" recebe o item atual
             produto.imprimir();
        }
    }

    public static void execEntrada(){
        Scanner sc = new Scanner(System.in);
        Produto produtoEncontrado = null; //Cria objeto produto para receber informacoes
        int quantidade=0;
        int id=0;
        do {
            //Lógica para procurar o item da lista:
            System.out.println("Digite o id do produto:");
            id=Integer.parseInt(sc.nextLine());


            for(Produto produto: produtos){
                if(produto.idProduto==id){
                    produtoEncontrado=produto;
                    break;
                }
            }
            if(produtoEncontrado==null){
                System.out.println("PRODUTO NAO ENCONTRADO");
            }
            System.out.println("Digite a quantidade de produtos:");
            quantidade = Integer.parseInt(sc.nextLine());

            if(quantidade<=0){
                System.out.println("DIGITE UM VALOR VALIDO");
            }
        }while(quantidade<=0);
        boolean status=produtoEncontrado.darEntrada(quantidade);

        if(status){
            System.out.println("ENTRADA EXECUTADA");
        }else{
            System.out.println("ENTRADA NEGADA");
        }
    }


}
