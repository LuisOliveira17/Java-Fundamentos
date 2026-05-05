package com.example.replicandocrud.service;

import com.example.replicandocrud.model.Livro;
import com.example.replicandocrud.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    public final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    //Save
    public Livro saveLivro(Livro livro){
        return livroRepository.save(livro);
    }

    //Delete
    public void deleteLivro(Long id){
        livroRepository.deleteById(id);
    }

    //Get
    public List<Livro> getAllLivro(){
        return livroRepository.findAll();
    }

    //GetPorId
    public Livro getLivroById(Long id){
        return livroRepository.findById(id).get();
    }

}
