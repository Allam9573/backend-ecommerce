package com.lukanka.backend.services;

import java.util.List;

import com.lukanka.backend.models.Categoria;

public interface CategoriaService {

    public void crearCategoria(Categoria categoria);

    public List<Categoria> listarCategorias();

}
