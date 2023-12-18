package com.lukanka.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.backend.models.Producto;
import com.lukanka.backend.services.impl.ProductoServiceImpl;

@RestController
@RequestMapping(value = "/api/productos")
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoServiceImpl;

    @PostMapping("/crear")
    public void creaProducto(@RequestBody Producto producto) {
        this.productoServiceImpl.crearProducto(producto);
    }

    @GetMapping("/listar-productos")
    public List<Producto> getAll() {
        return this.productoServiceImpl.listarProductos();
    }

}
