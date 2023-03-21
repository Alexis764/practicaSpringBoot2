package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.ProductosAlexis;
import com.example.practicaSpring.Servicios.ServicioProductosAlexis;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorProductosAlexis {

    ServicioProductosAlexis servicioProductos = new ServicioProductosAlexis();

    @GetMapping("/listarProductosAlexis")
    public ArrayList<ProductosAlexis> listarProductos() {
        return servicioProductos.mostrarListaProductosAlexis();
    }

    @GetMapping("/totalProductoAlexis")
    public ArrayList<ProductosAlexis> listarTotal() {
        return servicioProductos.totalProductoAlexis();
    }

    @PostMapping("/agregarProductoA")
    public String agregarProducto(@RequestBody ProductosAlexis producto) {
        return servicioProductos.agregarProductoAlexis(producto);
    }

    @GetMapping("/buscarCodigoProA/{cod}")
    public ProductosAlexis buscarCodigoPro(@PathVariable("cod") int codigoPro) {
        return servicioProductos.buscarCodigoProAlexis(codigoPro);
    }

    @GetMapping("/buscarCategoriaProA/{cat}")
    public ArrayList<ProductosAlexis> buscarCategoriaPro(@PathVariable("cat") String categoriaPro) {
        return servicioProductos.buscarCategoriaProAlexis(categoriaPro);
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
