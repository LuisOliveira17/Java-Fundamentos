package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int idCurso;
    private String descricao;
    private String periodo;
    private int numeroAlunos;
    private List<Disciplina> disciplinas;

    public Curso(int idCurso,String descricao,String periodo,int numeroAlunos){
        this.idCurso=idCurso;
        this.descricao=descricao;
        this.periodo=periodo;
        this.numeroAlunos=numeroAlunos;
        this.disciplinas = new ArrayList<>();
    }
    public int getIdCruso() {
        return idCurso;
    }

    public void setIdCruso(int idCruso) {
        this.idCurso = idCruso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void adicionarDisciplinas(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void listar(){
        System.out.println("idCurso = " + idCurso);
        System.out.println("descricao = " + descricao);
        System.out.println("periodo = " + periodo);
        System.out.println("numeroAlunos = " + numeroAlunos);
        System.out.println("------------------------------------");
        for(Disciplina disciplina:disciplinas){
            disciplina.listar();
        }
    }
}

