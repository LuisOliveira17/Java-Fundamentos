import java.sql.SQLOutput;
import java.util.Scanner;
public class ContaTeste {
    static Conta cc = new Conta(); //Atributo publico da classe conta
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("==================");
            System.out.println("1.Cadastrar");
            System.out.println("2.Depositar");
            System.out.println("3.Sacar");
            System.out.println("4.Consultar");
            System.out.println("0.Sair");
            System.out.println("==================");
            System.out.println("Escolha:");

            opcao = Integer.parseInt(sc.nextLine()); //Limpar o Buffer;

            //Não esquecer de implementar loop ao menu

            switch (opcao) {
                case 1 -> {
                    execCadastrar();

                }
                case 2 -> {
                    execDepositar();
                }
                case 3 -> {
                    execSacar();
                }
                case 4 -> {
                    execConsultar();
                }
                case 0 -> {
                    System.out.println("Fim do Progama");
                    break;
                }
                default -> {
                    System.out.println("Opcao Invalida");
                }
            };
        }while(opcao!=0);


    }

    //Quebrei a cabeça para decifrar o porque não chamava no switch;
    //Como o main é um metodo static, nao chamará funcs. não estáticas

    public static void execCadastrar(){
        System.out.println("Digite a conta:");
        cc.conta=input.nextLine();

        System.out.println("Digite a agencia:");
        cc.agencia=input.nextLine();

        System.out.println("Digite o saldo inicial:");
        cc.saldo=Double.parseDouble(input.nextLine());

        System.out.println("Digite o nome:");
        cc.nomeCliente=input.nextLine();

    }

    public static void execConsultar(){
        cc.imprimir();
    }

    public static void execSacar(){
        double valorSaque=0;
        System.out.println("Digite o valor saque:");
        valorSaque= Double.parseDouble(input.nextLine());

        cc.sacar(valorSaque);
        int status=cc.sacar(valorSaque);
        System.out.println(status);//Apenas para testar e ver se a lógica funcionou

        if(status==1){
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saque Não realizado");
        }
    }

    public static void execDepositar(){
        double valorDeposito=0;
        System.out.println("Digite valor deposito:");
        valorDeposito=Double.parseDouble(input.nextLine());
        cc.depositar(valorDeposito);
    }
}
