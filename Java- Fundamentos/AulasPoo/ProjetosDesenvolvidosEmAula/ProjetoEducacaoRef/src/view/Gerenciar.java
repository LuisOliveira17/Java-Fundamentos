package view;

import model.Curso;
import model.Disciplina;

import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Curso curso1 = new Curso(1,"ADS","Noturno",40);
        Disciplina disc1 = new Disciplina(1,"POO","Maromo",80);
        Disciplina disc2= new Disciplina(2,"Banco de dados","Sandro",80);
        curso1.adicionarDisciplinas(disc1);
        curso1.adicionarDisciplinas(disc2);

        // Curso 2
        Curso curso2 = new Curso(2, "Engenharia de Software", "Integral", 35);
        Disciplina disc3 = new Disciplina(3, "Estrutura de Dados", "Carlos", 80);
        Disciplina disc4 = new Disciplina(4, "Algoritmos", "Fernanda", 80);
        curso2.adicionarDisciplinas(disc4);

// Curso 3
        Curso curso3 = new Curso(3, "Sistemas de Informação", "Noturno", 45);
        Disciplina disc5 = new Disciplina(5, "Redes", "Roberto", 80);
        Disciplina disc6 = new Disciplina(6, "Segurança da Informação", "Juliana", 80);
        curso3.adicionarDisciplinas(disc5);
        curso3.adicionarDisciplinas(disc6);

// Curso 4
        Curso curso4 = new Curso(4, "Ciência da Computação", "Integral", 50);
        Disciplina disc7 = new Disciplina(7, "Inteligência Artificial", "Marcos", 80);
        Disciplina disc8 = new Disciplina(8, "Cálculo", "Patrícia", 80);
        curso4.adicionarDisciplinas(disc7);
        curso4.adicionarDisciplinas(disc8);

// Curso 5
        Curso curso5 = new Curso(5, "Análise de Sistemas", "Matutino", 30);
        Disciplina disc9 = new Disciplina(9, "Programação Web", "Lucas", 80);
        Disciplina disc10 = new Disciplina(10, "Banco de Dados II", "Ricardo", 80);
        curso5.adicionarDisciplinas(disc9);
        curso5.adicionarDisciplinas(disc10);

        curso1.listar();

    }

}

//Por conta de limitações (não ter um BD), vou criar o curso e logo abaixo adicionar as disciplinas