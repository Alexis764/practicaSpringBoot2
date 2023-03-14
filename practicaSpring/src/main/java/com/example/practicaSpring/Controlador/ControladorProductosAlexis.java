package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.ProductosAlexis;
import com.example.practicaSpring.Servicios.ServicioProductosAlexis;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorProductosAlexis {

    ServicioProductosAlexis servicioProductos = new ServicioProductosAlexis();

    @GetMapping("/listarProductosAlexis")
    public ArrayList<ProductosAlexis> listar() {
        return servicioProductos.mostrarLista();
    }

    @GetMapping("/cantidadProductos")
    public int mostrarCantidadProductos() {
        return servicioProductos.cantidadProductos();
    }

    @GetMapping("/totalProducto")
    public ArrayList<ProductosAlexis> listarTotal() {
        return servicioProductos.totalProducto();
    }

    @GetMapping("/totalFinal")
    public double mostrarTotalFinal() {
        return servicioProductos.totalFinal();
    }
}
