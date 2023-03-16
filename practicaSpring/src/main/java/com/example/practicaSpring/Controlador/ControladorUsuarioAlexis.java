package com.example.practicaSpring.Controlador;

import com.example.practicaSpring.Entidades.UsuarioAlexis;
import com.example.practicaSpring.Servicios.ServicioUsuarioAlexis;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorUsuarioAlexis {

    ServicioUsuarioAlexis servicio = new ServicioUsuarioAlexis();

    @GetMapping("/listarUsuarioA")
    public ArrayList<UsuarioAlexis> listarUsuario() {
        return servicio.listar();
    }

    @PostMapping("/agregarUsuarioA")
    public String agregarUsuario(@RequestBody UsuarioAlexis usuario) {
        return servicio.agregarUsuarioAlexis(usuario);
    }

}
