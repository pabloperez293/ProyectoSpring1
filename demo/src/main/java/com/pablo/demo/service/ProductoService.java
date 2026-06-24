package com.pablo.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pablo.demo.model.Producto;


@Service
// ¿Qué significa @Service?

// Le dice a Spring:

// "Esta clase es un servicio y quiero que la administres como un Bean."
public class ProductoService {
    
    public List<Producto> obtenerProductos() {
        return List.of( new Producto(
            1L, "Notebook", 1200.0),
            new Producto(2L, "Mouse", 25.0),
            new Producto(3L, "Teclado", 50.0),
            new Producto(4L, "Monitor", 300.0));
    }
}
