package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.ProductosAlexis;
import com.example.practicaSpring.Servicios.ServicioProductosAlexis;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorProductosAlexis {

    ServicioProductosAlexis servicioProductos = new ServicioProductosAlexis();

    @GetMapping("/listarProductosAlexis")
    public ArrayList<ProductosAlexis> listarProductos() {
        return servicioProductos.mostrarListaProductos();
    }

    @GetMapping("/totalProductoAlexis")
    public ArrayList<ProductosAlexis> listarTotal() {
        return servicioProductos.totalProducto();
    }




    @GetMapping("/cantidadProductos")
    public int mostrarCantidadProductos() {
        return servicioProductos.cantidadProductos();
    }

    @GetMapping("/totalFinal")
    public double mostrarTotalFinal() {
        return servicioProductos.totalFinal();
    }
}
