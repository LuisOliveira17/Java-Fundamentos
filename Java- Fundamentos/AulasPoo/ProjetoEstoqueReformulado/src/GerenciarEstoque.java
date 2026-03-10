import java.util.Scanner;
public class GerenciarEstoque {
    static Estoque estoque = new Estoque();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=0;

        do{
            System.out.println("1.Cadastrar");
            System.out.println("2.Listar");
            System.out.println("3.Venda");
            System.out.println("4.Sair");
            System.out.println("-------------------");
            System.out.println("Escolha:");
            op=sc.nextInt();

            switch (op){
                case 1->execCadastro();
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

    


}



