package com.example.replicandocrud.repository;

import com.example.replicandocrud.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long> {

}
