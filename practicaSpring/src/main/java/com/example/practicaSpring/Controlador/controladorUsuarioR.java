package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.UsuarioR;
import com.example.practicaSpring.Servicios.servicioUsuarioR;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorUsuarioR {
    servicioUsuarioR servicio = new servicioUsuarioR();

    @GetMapping("/listarUsuario")
    public ArrayList<UsuarioR> listarUsuario(){
        return servicio.listar();
    }

    @PostMapping("/agregarUsuario")
    public String agregar(@RequestBody UsuarioR usuario){
        return servicio.agregarUsuario(usuario);
    }
}
