package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.ProductosR;
import com.example.practicaSpring.Servicios.servicioProductosR;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorProductosR {

    servicioProductosR servicio = new servicioProductosR();


    @GetMapping("/listarproductos")
    public ArrayList<ProductosR> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/listarcantidad")
    public int cantidadproductos(){
        return servicio.cantidad();
    }


    @GetMapping("/precioProductos")
    public ArrayList<ProductosR> listarTotal() {
        return servicio.precioProductos();
    }

    @GetMapping("/cantidadTotal")
    public double cantidadTotal() {
        return servicio.totalProductos();
    }

}
