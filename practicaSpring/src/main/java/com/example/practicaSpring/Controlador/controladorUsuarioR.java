package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.UsuarioR;
import com.example.practicaSpring.Servicios.servicioUsuarioR;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorUsuarioR {
    servicioUsuarioR servicio = new servicioUsuarioR();


    //Mostrar los datos
    @GetMapping("/listarUsuario")
    public ArrayList<UsuarioR> listarUsuario(){
        return servicio.listar();
    }


    //Agregar un dado
    @PostMapping("/agregarUsuario")
    public String agregar(@RequestBody UsuarioR usuario){
        return servicio.agregarUsuario(usuario);
    }


    //Buscar un dato
    @GetMapping("/buscarUsuario/{cod}")
    public UsuarioR buscarUsuario(@PathVariable("cod") int codigo){
        return servicio.buscarUsuario(codigo);
    }
}
