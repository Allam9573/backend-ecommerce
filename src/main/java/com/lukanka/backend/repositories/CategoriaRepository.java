package com.lukanka.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lukanka.backend.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
}
