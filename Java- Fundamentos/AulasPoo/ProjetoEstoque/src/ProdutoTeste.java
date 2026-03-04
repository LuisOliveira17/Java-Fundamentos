import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args){
        Produto prod = new Produto();
        Scanner input = new Scanner(System.in);
        ProdutoTeste prodTeste= new ProdutoTeste();

        int opcao=0;
        do{
            System.out.println("==================");
            System.out.println("1.Cadastrar");
            System.out.println("2.Venda");
            System.out.println("3.Consultar");
            System.out.println("4.Sair");
            System.out.println("==================");
            System.out.println("Escolha:");
            opcao=Integer.parseInt(input.nextLine());

            switch (opcao){
                case 1->prodTeste.execCadastrar();
                case 2->prodTeste.execImprimir();
            }


        }while(opcao!=4);
    }

    public void  execCadastrar(){
        Scanner sc =  new Scanner(System.in);
        Produto prodExec = new Produto();

        System.out.println("Digite id produto:");
        prodExec.idProduto=Integer.parseInt(sc.nextLine());


        System.out.println("Digite nome produto:");
        prodExec.nome=sc.nextLine();

        System.out.println("Digite Quantidade produto:");
        prodExec.quantidade=Integer.parseInt(sc.nextLine());

        System.out.println("Digite o preco:");
        prodExec.preco=Double.parseDouble(sc.nextLine());
    }

    public void execImprimir(){
        Produto prodExec = new Produto();

        prodExec.imprimir();

    }
}
