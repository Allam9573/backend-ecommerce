package com.lukanka.backend.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.backend.models.Categoria;
import com.lukanka.backend.repositories.CategoriaRepository;
import com.lukanka.backend.services.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public void crearCategoria(Categoria categoria) {
        this.categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> listarCategorias() {
        return this.categoriaRepository.findAll();
    }

}
