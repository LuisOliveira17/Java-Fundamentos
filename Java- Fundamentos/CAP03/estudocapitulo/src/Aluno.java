import java.util.Scanner;
public class Aluno {
    public static void main(String[] args) {
        //Cria o objeto para puxar as inforamções da Classe:
        InformacoesAlunos info = new InformacoesAlunos();
        Scanner input= new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome=input.nextLine();

        info.nome(nome);

        int idade = info.idade();

        System.out.printf("Pelo que vi, voce tem %d anos de idade!!!\n",idade);

        System.out.print("Qual o seu curso:\n");
        String curso= input.nextLine();

        info.setNomeCurso(curso); //Setar o nome do curso na varivael de modificador de acesso private
        info.mostrarMensagem(); //Irá mostrar a mensagem já puxando pelo get

        System.out.printf("\nVamos calcular a media da sala de %s!!\n",info.getNomeCurso());
        info.mediaClasse();


    }

}