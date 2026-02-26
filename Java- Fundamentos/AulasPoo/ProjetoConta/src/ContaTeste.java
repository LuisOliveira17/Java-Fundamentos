import java.sql.SQLOutput;
import java.util.Scanner;
public class ContaTeste {
    Conta cc = new Conta(); //Atributo publico da classe conta

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("==================");
        System.out.println("1.Cadastrar");
        System.out.println("2.Depositar");
        System.out.println("3.Sacar");
        System.out.println("4.Consultar");
        System.out.println("0.Sair");
        System.out.println("==================");
        System.out.println("Escolha:");

        int opcao=Integer.parseInt(sc.nextLine()); //Limpar o Buffer;

        switch (opcao){
            case 1->{
               execCadastrar();
            }
        }
    }

    //Quebrei a cabeça para decifrar o porque não chamava no switch;
    //Como o main é um metodo static, nao chamará funcs. não estáticas
    public static void execCadastrar(){

    }

    public void execConsultar(){

    }

    public void execSacar(){

    }

    public void execDepositar(){

    }
}
