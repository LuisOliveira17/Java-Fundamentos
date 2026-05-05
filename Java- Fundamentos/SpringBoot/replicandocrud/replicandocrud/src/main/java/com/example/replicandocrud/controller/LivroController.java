package com.example.replicandocrud.controller;

import com.example.replicandocrud.model.Livro;
import com.example.replicandocrud.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    public final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<Livro> getAllLivro(){
        return livroService.getAllLivro();
    }

    @PostMapping
    public Livro saveLivro(@RequestBody Livro livro){
        return livroService.saveLivro(livro);
    }

    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable Long id){
        livroService.deleteLivro(id);
    }

    @GetMapping("/{id}")
    public Livro getAllLivros(@PathVariable Long id){
        return livroService.getLivroById(id);
    }
}
