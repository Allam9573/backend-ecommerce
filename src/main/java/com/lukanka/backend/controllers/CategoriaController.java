package com.lukanka.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.backend.models.Categoria;
import com.lukanka.backend.services.impl.CategoriaServiceImpl;

@RestController
@RequestMapping(value = "/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaServiceImpl categoriaServiceImpl;

    @GetMapping(value = "/listar-categorias")
    public List<Categoria> listarCategorias() {
        return this.categoriaServiceImpl.listarCategorias();
    }

    @PostMapping(value = "/crear-categoria")
    public void crearCategoria(@RequestBody Categoria categoria) {
        this.categoriaServiceImpl.crearCategoria(categoria);
    }

}
