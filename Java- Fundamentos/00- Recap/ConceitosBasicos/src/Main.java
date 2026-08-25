import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();

        System.out.println("Digite o nome da Pessoa:");
        pessoa1.setNome(input.nextLine());
        pessoa1.setIdade(19);
        pessoa1.setSexo('M');
        pessoa1.setDataNascimento(LocalDate.of(2006, 12, 28));
        pessoa1.provarExistencia();
    }
}