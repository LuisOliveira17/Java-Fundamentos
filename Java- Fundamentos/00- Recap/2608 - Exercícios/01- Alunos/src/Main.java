/*
 1. Calculadora de Média
Classe Aluno com nome, nota1, nota2; construtor; calcularMedia(); verificarSituacao();
criar 2 alunos.
 */

public class Main {
    public static void main (String[] args) {
        Aluno aluno1 = new Aluno( "Caio", 10, 5);
        Aluno aluno2 = new Aluno("Mariazinha", 4,2);

        System.out.println("Media Aluno1:"+aluno1.calcularMedia());
        System.out.println("Media Aluno2:"+aluno2.calcularMedia());

        aluno1.verificarSituacao();
        aluno2.verificarSituacao();


    }

}