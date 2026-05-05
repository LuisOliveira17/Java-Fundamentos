package com.example.replicandocrud.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private String autor;
    private String genero;
    private LocalDate dataPublicacao;

    public Livro(){

    }

    public Livro(String titulo, String autor, String genero, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.dataPublicacao = dataPublicacao;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
