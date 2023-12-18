package com.lukanka.backend.services;

import java.util.List;

import com.lukanka.backend.models.Producto;

public interface ProductoService {

    public void crearProducto(Producto producto);

    public List<Producto> listarProductos();

}
