import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
public class GerenciarFuncionario {
    public static List<Funcionario> funcionarios = new ArrayList<>(); // Está estático para poder acessar no metodo estático
    public static void main(String[] args) {
        int opcao;
        Funcionario funcionario1= new Funcionario();

        funcionario1.setNome("Diego");
        funcionario1.setDepartamento("Agendamento");
        funcionario1.setRg("2232313");
        funcionario1.setSalario(2000);
        funcionario1.setAtivo(true);
        funcionarios.add(funcionario1);

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Cadastrar");
            System.out.println("2.Consultar");
            System.out.println("3.Bonificar");
            System.out.println("4.Sair");
            System.out.println("-----------------");
            System.out.println("Escolha:");
             opcao= Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1 -> execCadastro();
                case 2 -> execConsultar();
                case 3 -> execBonificar();
                case 4 -> System.out.println("FIM");
                default -> System.out.println("Selecione uma opcao valida");
            }
        }while(opcao!=4);

    }

    public static void execConsultar(){
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        int posicao;

        System.out.println("Digite a posicao que o func. se encontra:");
        posicao=Integer.parseInt((sc.nextLine()));

        funcionario=funcionarios.get(posicao);

        System.out.println(funcionario.listar());

    }

    public static void execBonificar(){

    }

    public static void execCadastro(){
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario(); //Cria um novo objeto para adicionar ao vetor

        System.out.println("Digite o departamento:");
        funcionario.setDepartamento(sc.nextLine());

        System.out.println("Digite o salario:");
        funcionario.setSalario(Double.parseDouble(sc.nextLine()));

        System.out.println("Digite o rg:");
        funcionario.setRg(sc.nextLine());

        System.out.println("Digite o nome:");
        funcionario.setNome(sc.nextLine());

        System.out.println("Digite situacao funcionario(true/false)");
        funcionario.setAtivo(sc.nextBoolean());

        funcionarios.add(funcionario);

    }
}
