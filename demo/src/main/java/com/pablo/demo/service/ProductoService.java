package com.pablo.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
// ¿Qué significa @Service?

// Le dice a Spring:

// "Esta clase es un servicio y quiero que la administres como un Bean."
public class ProductoService {
    
    public List<String> obtenerProductos() {
        return List.of("Producto 1", "Producto 2", "Producto 3");
    }
}
