import java.util.Scanner;

public class InformacoesAlunos {
    private String nomeCurso;

    public void nome(String nomeAluno){
        System.out.printf("Olá %s\n",nomeAluno);
    }

    public int idade(){
        return 19;
    }

    public void setNomeCurso(String curso){
        nomeCurso= curso;
    }

    public String getNomeCurso(){
        return nomeCurso;
    }

    public void mostrarMensagem(){
        System.out.printf("Seja bem vindo ao curso de: %s", getNomeCurso());
    }

    public void mediaClasse(){
        Scanner input= new Scanner(System.in);
        int somaNota=0;
        int nota=0;
        int contNotas=1;
        float media=0;

        while(contNotas<=10){
            System.out.printf("Digite a nota %d:",contNotas);
            nota=input.nextInt();
            somaNota+=nota;
            contNotas++;
        }
        media=somaNota/contNotas;
        System.out.printf("\nMedia:%.2f",media);
    }
}
