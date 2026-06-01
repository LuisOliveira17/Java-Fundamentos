import exception.EstoqueInsuficienteException;
import model.Dvd;
import model.Livro;
import model.Produto;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  public static   ArrayList<Produto> produtos = new ArrayList<>();
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("------Menu------");
            System.out.println("1.Cadastrar um livro e um DVD");
            System.out.println("2.Listar Produtos");
            System.out.println("3.Vender");
            System.out.println("4.Sair");
            System.out.println("-------------------");
            System.out.println("Escolha:");
            escolha = Integer.parseInt(sc.nextLine());

            switch (escolha) {
                case 1:
                    execCadastro();
                    break;
                case 2:
                    listarProdutos();
                    break;
                    case 3:
                        gerarVendas();
                        break;
                        case 4:
                            System.out.println("FINALZIADO !!!!!!");
                            break;
            }
        } while (escolha != 4);
    }

    public static void execCadastro(){
        Livro livro = new Livro("Livro de ensino Java",20,50.00,"Deitel",300.00);
        Dvd dvd = new Dvd("Filme boladissimo do Matrix!!!",50,70.00,95.00,"SEI LA DA SILVA");
        addProduto(livro);
        addProduto(dvd);
    }

    public static void addProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }
    public static void listarProdutos(){
        for (Produto produto : produtos) {
            System.out.println("--------------------");
            produto.exibirDados();
        }
    }

    public static void gerarVendas(){
        Scanner sc = new Scanner(System.in);

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("Produtos disponíveis:");

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + " - " + produtos.get(i).getDescricao());
        }

        System.out.print("Escolha o produto: ");
        int opcao = Integer.parseInt(sc.nextLine());

        Produto produto = produtos.get(opcao - 1);

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        try {
            produto.vender(quantidade);
        }catch (EstoqueInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}
