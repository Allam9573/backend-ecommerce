package com.lukanka.backend.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.backend.models.Producto;
import com.lukanka.backend.repositories.ProductoRepository;
import com.lukanka.backend.services.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public void crearProducto(Producto producto) {
        this.productoRepository.save(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return this.productoRepository.findAll();
    }

}
